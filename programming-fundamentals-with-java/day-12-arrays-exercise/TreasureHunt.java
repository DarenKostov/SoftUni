import java.util.Scanner;

class TreasureHunt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] items=scanner.nextLine().split("\\|");

        String[] input=scanner.nextLine().split(" ");

        while(!input[0].equals("Yohoho!")){

            switch(input[0]){
                case "Loot":
                    for(int i=1; i<input.length; i++){
                        boolean skip=false;
                        for(int j=0; j<items.length; j++){
                            //skip the item if it already exists
                            if(input[i].equals(items[j])){
                                skip=true;
                                break;
                            }
                        }
                        if(skip)
                            continue;
                        
                        //add at the begining

                        String[] newItems=new String[items.length+1];
                        
                        for(int j=1; j<newItems.length; j++)
                            newItems[j]=items[j-1];
                        newItems[0]=input[i];

                        items=newItems;
                    }
                    
                    break;

                case "Drop":
                    int index= Integer.parseInt(input[1]);

                    //out of bounds
                    if(index<0 || index>items.length-1)
                        break;
                    
                    String dropped=items[index];
                    for(int j=index; j<items.length-1; j++){
                        items[j]=items[j+1];
                        }
                    items[items.length-1]=dropped;
                                       
                    break;    

                case "Steal":
                    int amountStolen=Integer.parseInt(input[1]);
                    
                    //if everything is stolen
                    if(amountStolen>=items.length){
                        for(int i=0; i<items.length-1; i++)
                            System.out.printf("%s, ", items[i]);
                        System.out.printf("%s\n", items[items.length-1]);
                        items=new String[0];
                        break;
                    }
                    
                    String[] newItems=new String[items.length-amountStolen];

                    //print the stolen items
                    for(int i=items.length-amountStolen; i<items.length-1; i++)
                        System.out.printf("%s, ", items[i]);
                    System.out.printf("%s\n", items[items.length-1]);
                        
                    //remove the stone items
                    for(int i=0; i<newItems.length; i++)
                        newItems[i]=items[i];

                    items=newItems;

                    break;
            }    
            
            input=scanner.nextLine().split(" ");
        }

    double gain=0;
    for(int i=0; i<items.length; i++){
        gain+=items[i].length();
    }

    if(gain==0)
        System.out.println("Failed treasure hunt.");
    else
        System.out.printf("Average treasure gain: %.2f pirate credits.\n", gain/items.length);


            
    }
}
