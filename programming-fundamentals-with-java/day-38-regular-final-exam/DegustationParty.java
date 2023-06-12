import java.util.*;

class DegustationParty{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> guests=new LinkedHashMap<>();
        List<String> dislikedMeals=new ArrayList<String>();
        
        for(String[] command=scanner.nextLine().split("-"); !command[0].equals("Stop"); command=scanner.nextLine().split("-")){
            if(command[0].equals("Dislike")){
                if(guests.containsKey(command[1])){
                    if(guests.get(command[1]).contains(command[2])){
                        guests.get(command[1]).remove(command[2]);
                        dislikedMeals.add(command[2]);
                        System.out.printf("%s doesn't like the %s.\n", command[1], command[2]);
                    }else{
                        System.out.printf("%s doesn't have the %s in his/her collection.\n", command[1], command[2]);
                    }
                }else{
                    System.out.printf("%s is not at the party.\n", command[1]);
                }
            }else{
                guests.putIfAbsent(command[1], new ArrayList<String>());

                if(guests.get(command[1]).contains(command[2])){
                    //do nothing
                }else{
                    guests.get(command[1]).add(command[2]);
                }
            
            }
        
        }

        for(Map.Entry<String, List<String>> guest : guests.entrySet()){
            System.out.printf("%s: ", guest.getKey());
            System.out.println(String.join(", ", guest.getValue()));
        }
        
            System.out.printf("Unliked meals: %d\n", dislikedMeals.size());

        
        
    }
}
