import java.util.Scanner;

class MultiplyBigNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num1=scanner.nextLine();
        int num2=Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        String output="";

        int remainder=0;
        
        for(int i=num1.length()-1; i>=0; i--){

            int product=Integer.parseInt(""+num1.charAt(i))*num2;

            product+=remainder;

            int digit=product%10;
            
            remainder=(product-digit)/10;
            
            output=digit+output;

        }
        if(remainder!=0)
            output=remainder+output;

        System.out.println(output);

    }
}
