import java.util.*;


class Bag{


    private static final Comparator<Item> COMPARE_ITEM_BY_NAME = Comparator.comparing(Item::getName);
    private static final Comparator<Item> COMPARE_ITEM_BY_AMOUNT = Comparator.comparing(Item::getAmount);

    private long capacity;
    private long capacityUsed;
    
    private List<Item> inventory;

    
    private LinkedHashMap<ItemType, Long> individualAmounts= new LinkedHashMap<>();
    Bag(long capacity){
        this.capacity=capacity;
        this.capacityUsed=0;
        
        inventory=new ArrayList<>();

        individualAmounts.put(ItemType.Gold, 0l);
        individualAmounts.put(ItemType.Gem, 0l);
        individualAmounts.put(ItemType.Cash, 0l);
    }
    
    
    public void addItems(String name, long amount){
    
        ItemType type=string2ItemType(name);

        if(type==null){
            return;
        }
        // System.out.println(type+" | "+name+" | "+amount);

        if(capacityUsed+amount>capacity){
            return;
        }

        if(type==ItemType.Gem){
            if(individualAmounts.get(type)+amount>individualAmounts.get(ItemType.Gold)){
                return;
            }
        }else if(type==ItemType.Cash){
            if(individualAmounts.get(type)+amount>individualAmounts.get(ItemType.Gem)){
                return;
            }
        }
       
        inventory.add(new Item(amount, type, name));
        individualAmounts.put(type, individualAmounts.get(type)+amount);
    }


    public ItemType string2ItemType(String in){
        if(in.length()<3){
            return null;
        }
        if(in.length()==3){
            return ItemType.Cash;
        }

        in=in.toLowerCase();
        
        if(in.endsWith("gem")){
            return ItemType.Gem;
        }

        if(in.equals("gold")){
            return ItemType.Gold;
        }

        return null;
    }


    public void printItems(){
        individualAmounts.entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() != 0)
                                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                                .forEach(entry -> {
                                    System.out.printf("<%s> $%s\n", entry.getKey(), entry.getValue());
                                    this.inventory.stream()
                                              .filter(item -> item.type.equals(entry.getKey()))
                                              .sorted(COMPARE_ITEM_BY_NAME.reversed().thenComparing(COMPARE_ITEM_BY_AMOUNT))
                                              .forEach(item -> {
                                                  System.out.printf("##%s - %d\n", item.name, item.amount);
                                              });
                                });

        
    }


    
    
    private enum ItemType{
        Gold,
        Cash,
        Gem;
   }

    private class Item{
        public long amount;
        public ItemType type;
        public String name;

        Item(long amount, ItemType type, String name){
            this.amount=amount;
            this.type=type;
            this.name=name;
        }

        public long getAmount(){
            return amount;
        }
    
        public String getName(){
            return name;
        }
    }


}
