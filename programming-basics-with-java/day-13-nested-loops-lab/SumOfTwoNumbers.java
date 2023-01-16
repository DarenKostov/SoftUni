import java.util.Scanner;
class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int end=Integer.parseInt(scanner.nextLine());
        int sum=Integer.parseInt(scanner.nextLine());
        
        int count=0;
        boolean isFound=false;
        
        outer_loop:
        for(int i=start; i<=end; i++)
            for(int j=start; j<=end; j++){
                count++;
                if(i+j==sum){
                System.out.printf("Combination N:%d (%d + %d = %d)\n", count, i, j, sum);
                isFound=true;
                break outer_loop;
                }
            }
            
        
        if(!isFound)
            System.out.printf("%d combinations - neither equals %d", count, sum);
        
        
    }
}
