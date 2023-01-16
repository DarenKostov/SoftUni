import java.util.Scanner;
class LeftAndRightSum{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sum1=0;
        int sum2=0;


        for(int i=0; i<n; i++)
            sum1+=Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++)
            sum2+=Integer.parseInt(scanner.nextLine());

        if(sum1==sum2)
            System.out.println("Yes, sum = "+sum1);
        else
            System.out.println("No, diff = "+Math.abs(sum1-sum2));
        


    }
}
