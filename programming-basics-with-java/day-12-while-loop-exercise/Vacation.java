import java.util.Scanner;
class Vacation{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double neededMoney=Double.parseDouble(scanner.nextLine());
        double currentMoney=Double.parseDouble(scanner.nextLine());
        int spendingCounter=0;
        int dayCounter=0;
        
        while(currentMoney<neededMoney && spendingCounter<5){
            String action=scanner.nextLine();
            double money=Double.parseDouble(scanner.nextLine());
            dayCounter++;
            switch(action){
                case "save":
                    currentMoney+=money;
                    spendingCounter=0;
                    break;
                case "spend":
                    currentMoney=Math.max(0,currentMoney-money);
                    spendingCounter++;
            }
            
        }
        
        if(spendingCounter>=5){
            System.out.println("You can't save the money.");
            System.out.println(dayCounter);
        }else{
            System.out.printf("You saved the money for %d days.\n", dayCounter);
        }
        
    }
    
}
