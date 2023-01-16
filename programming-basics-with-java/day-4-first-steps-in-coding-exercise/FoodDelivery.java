import java.util.Scanner;
class FoodDelivery{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        double chicken= Integer.parseInt(scanner.nextLine())*10.35;
        double fish= Integer.parseInt(scanner.nextLine())*12.40;
        double vegetarian= Integer.parseInt(scanner.nextLine())*8.15;
        
        double price= chicken+fish+vegetarian;
        
        double dessert= price*0.2;
        
        double totalPrice=price+dessert+2.5;
        
        System.out.println(totalPrice);
        
        
        
        
        
        
    }
}
