import java.util.Scanner;
class Basketball{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
   
        int fee= Integer.parseInt(scanner.nextLine());
        
        double sneakers=fee*0.6;
        double outfit= sneakers*0.8;
        double ball= outfit*0.25;
        double accessories= ball*0.2;
        
        double totalPrice=fee+sneakers+outfit+ball+accessories;
        
        System.out.println(totalPrice);
        
    }
}
