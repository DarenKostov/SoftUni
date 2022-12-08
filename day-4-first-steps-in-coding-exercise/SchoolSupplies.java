import java.util.Scanner;
class SchoolSupplies{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        double pens= Integer.parseInt(scanner.nextLine())*5.8;
        double markers= Integer.parseInt(scanner.nextLine())*7.2;
        double detergent= Integer.parseInt(scanner.nextLine())*1.2;
        
        double price=pens+markers+detergent;
        
        double discount= 1.0*Integer.parseInt(scanner.nextLine())/100;
        
        price*=1-discount;
        
        System.out.println(price);
        
    }
}
