import java.util.Scanner;
class GodzillaVsKong{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        double budget=Double.parseDouble(scanner.nextLine());
        int extras=Integer.parseInt(scanner.nextLine());
        //clothing for 1 extra
        double clothingPrice=Double.parseDouble(scanner.nextLine());
        
        double directorPayment=budget*0.1;
        double totalClothingPrice=extras*clothingPrice;
        
        if(extras>150)
            totalClothingPrice*=0.9;
            
        double difference=budget-directorPayment-totalClothingPrice;
        
        if(difference<0){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.\n", Math.abs(difference));
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.\n", difference);
        }  
                        
        
    }
}
