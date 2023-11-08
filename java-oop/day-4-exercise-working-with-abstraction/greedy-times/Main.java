import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        
        long capacity=Long.parseLong(scanner.nextLine());
        Bag bag=new Bag(capacity);

    
        String[] contents=scanner.nextLine().split("\\s+");    

        for(int i=0; i<contents.length; i+=2){
            long amount=Long.parseLong(contents[i+1]);

            bag.addItems(contents[i], amount);
        }

        bag.printItems();        
                
                    
    }
}
