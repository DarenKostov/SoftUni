import java.util.Scanner;

class SumDigits{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num=scanner.nextLine();
        int sum=0;

        for(int i=0; i<num.length(); i++)
            sum+=num.charAt(i)-'0';

        System.out.println(sum);


        
    }
}
