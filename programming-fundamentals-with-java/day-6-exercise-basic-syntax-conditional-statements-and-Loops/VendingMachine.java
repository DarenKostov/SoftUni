import java.util.Scanner;

class VendingMachine{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        double totalMoney=0;


        //money insertion
        while(!input.equals("Start")){
            
        int moneyInserted=(int)(100*Double.parseDouble(input));

        switch(moneyInserted){
            case 10:
            case 20:
            case 50:
            case 100:
            case 200:
                totalMoney+=0.01*moneyInserted;
                break;
            default:
                System.out.printf("Cannot accept %.2f\n", 0.01*moneyInserted);
        }

        input=scanner.nextLine();
         
        }

        //product ordering
        input=scanner.nextLine();
        while(!input.equals("End")){
            String product=input;
            
            double previousTotalMoney=totalMoney;
            
            switch(product){
                case "Nuts":
                    totalMoney-=2;
                    break;
                case "Water":
                    totalMoney-=0.7;
                    break;
                case "Crisps":
                    totalMoney-=1.5;
                    break;
                case "Soda":
                    totalMoney-=0.8;
                    break;
                case "Coke":
                    totalMoney-=1;
                    break;
                default:
                    System.out.println("Invalid product");
                    input=scanner.nextLine();
                    continue;
            }

            if(totalMoney<0){
                System.out.println("Sorry, not enough money");
                totalMoney=previousTotalMoney;
            }else{
                System.out.printf("Purchased %s\n", product);
            }
            
            input=scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n", totalMoney);

        
    }
}
