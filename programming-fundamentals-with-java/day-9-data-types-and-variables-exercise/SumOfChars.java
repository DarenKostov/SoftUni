import java.util.Scanner;

class SumOfChars{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int sum=0;
    
        for(int i=0; i<N; i++)
            sum+=scanner.nextLine().charAt(0);
        
        System.out.printf("The sum equals: %d\n", sum);
        
        
        
        
    }
}
