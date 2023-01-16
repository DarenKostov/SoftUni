import java.util.Scanner;
class DepositCalc{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        double deposit= Double.parseDouble(scanner.nextLine());
        int period= Integer.parseInt(scanner.nextLine());
        double interestRate= Double.parseDouble(scanner.nextLine());
        
        interestRate/=100; 
        
        double sum= deposit+period*((deposit*interestRate)/12);
        System.out.println(sum);
    }
}
