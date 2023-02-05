import java.util.Scanner;

class Orders{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int orders=Integer.parseInt(scanner.nextLine());
        double totalPrice=0;
        
        for(int i=0; i<orders; i++){
            

        
            double price=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int count=Integer.parseInt(scanner.nextLine());

            double orderPrice=price*days*count;

            totalPrice+=orderPrice;
            
            System.out.printf("The price for the coffee is: $%.2f\n", orderPrice);
            
        }
        System.out.printf("Total: $%.2f\n", totalPrice);
        

    }
}
