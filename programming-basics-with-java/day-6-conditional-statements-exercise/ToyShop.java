import java.util.Scanner;
class ToyShop{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        double excursionPrice=Double.parseDouble(scanner.nextLine());
        int puzzles=Integer.parseInt(scanner.nextLine());
        int dolls=Integer.parseInt(scanner.nextLine());
        int teddyBears=Integer.parseInt(scanner.nextLine());
        int minions=Integer.parseInt(scanner.nextLine());
        int trucks=Integer.parseInt(scanner.nextLine());
    
                            
        int toys=puzzles+dolls+teddyBears+minions+trucks;
        
        double moneyGained;
        double moneyForExcursion;
        
        double toysPrice=puzzles*2.6;
        toysPrice+=dolls*3.0;
        toysPrice+=teddyBears*4.1;
        toysPrice+=minions*8.2;
        toysPrice+=trucks*2.0;
        
        //discount
        moneyGained=toysPrice;
        if(toys>=50)
            moneyGained*=0.75;
        
        moneyForExcursion=moneyGained*0.9;
        
        //difference between money left for excursion and its price
        double difference=Math.abs(moneyForExcursion-excursionPrice);

        if(moneyForExcursion>=excursionPrice)
            System.out.printf("Yes! %.2f lv left.\n", difference);
        else
            System.out.printf("Not enough money! %.2f lv needed.\n", difference);
            
    }
}
