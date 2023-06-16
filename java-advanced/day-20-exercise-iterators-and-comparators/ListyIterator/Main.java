import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ListyIterator myList=new ListyIterator();

        String[] newList=scanner.nextLine().split(" ");
        if(newList.length>1){
            myList=new ListyIterator(Arrays.copyOfRange(newList, 1, newList.length));
        }
            

        while(true){
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("END")){
                break;
            }

            switch(input[0]){
                case "Create":

                    if(newList.length==1){
                        myList=new ListyIterator(Arrays.copyOfRange(newList, 1, newList.length));
                    }else{
                        myList=new ListyIterator();
                    }
                    
                    break;
                case "Move":
                    System.out.println(myList.move());
                    break;
                case "Print":

                    try{
                        myList.print();
                    }catch(IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }

                    break;
                case "HasNext":
                    System.out.println(myList.hasNext());
                    break;
            
            
            }

            
        
        }

        
    
    }
}
