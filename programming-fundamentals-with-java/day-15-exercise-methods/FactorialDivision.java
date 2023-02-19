import java.util.Scanner;

class FactorialDivision{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

        double result=1.0*factorial(num1)/factorial(num2);
            
        System.out.printf("%.2f\n", result);
        
    }

    static double factorial(int n){
        double out=1;

        for(int i=1; i<=n; i++)
            out*=i;
        return out;
    
    }
}
