import java.util.Scanner;
class AccountBalance{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double sum=0;
        double inc=0;
        while(!input.equals("NoMoreMoney")){
            inc=Double.parseDouble(input);
            if(inc<0){
                System.out.println("Invalid operation!");
                break;
            }
            sum+=inc;
            System.out.printf("Increase: %.2f\n", inc);
            input=scanner.nextLine();
        }
        
        System.out.printf("Total: %.2f\n", sum);
        
    }
}
