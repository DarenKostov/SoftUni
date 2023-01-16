import java.util.Scanner;
class EasterDecoration{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int shops=Integer.parseInt(scanner.nextLine());
        
        double totalBill=0;
        
        for(int i=0; i<shops; i++){
            String item=scanner.nextLine();
            int itemCount=0;
            double bill=0;
            while(!item.equals("Finish")){
                itemCount++;
                switch(item){
                    case "basket":
                        bill+=1.50;
                        break;
                    case "wreath":
                        bill+=3.80;
                        break;
                    case "chocolate bunny":
                        bill+=7.00;
                        break;
                }
            item=scanner.nextLine();
            }
            
            if(itemCount%2==0)
                bill*=0.80;
            
            totalBill+=bill;
            System.out.printf("You purchased %s items for %.2f leva.\n", itemCount, bill);
        }
        double averageBill=totalBill/=shops;
        System.out.printf("Average bill per client is: %.2f leva.\n", averageBill);

    }
}
