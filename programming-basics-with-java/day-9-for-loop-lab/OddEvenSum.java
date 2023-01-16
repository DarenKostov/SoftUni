import java.util.Scanner;
class OddEvenSum{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int n=Integer.parseInt(scanner.nextLine());
        
        int sum1=0;
        int sum2=0;

        for(int i=0; i<n; i++){
        if(i%2==0)
            sum1+=Integer.parseInt(scanner.nextLine());
        else
            sum2+=Integer.parseInt(scanner.nextLine());
        }
        
        if(sum1==sum2)
            System.out.println("Yes\nSum = "+sum1);
        else
            System.out.println("No\nDiff = "+Math.abs(sum1-sum2));

        

    }
}
