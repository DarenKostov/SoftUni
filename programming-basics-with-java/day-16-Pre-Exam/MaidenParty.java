import java.util.Scanner;
class MaidenParty{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double partyPrice=Double.parseDouble(scanner.nextLine());
        int loveLetter=Integer.parseInt(scanner.nextLine());
        int waxRoses=Integer.parseInt(scanner.nextLine());
        int keyHolder=Integer.parseInt(scanner.nextLine());
        int caricature=Integer.parseInt(scanner.nextLine());
        int luckySurprise=Integer.parseInt(scanner.nextLine());
        
        int items=loveLetter+waxRoses+keyHolder+caricature+luckySurprise;
        double price=0.6*loveLetter+7.2*waxRoses+3.6*keyHolder+18.2*caricature+22*luckySurprise;
        
        if(items>=25)
            price*=0.65;

        price*=0.9;
        
        double difference=price-partyPrice;
        
        if(difference>0)
            System.out.printf("Yes! %.2f lv left.\n", difference);    
        else
            System.out.printf("Not enough money! %.2f lv needed.\n", Math.abs(difference));
    
        
            
                
                    
    }
}
