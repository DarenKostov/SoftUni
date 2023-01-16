import java.util.Scanner;
class Sequence2k1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int in=Integer.parseInt(scanner.nextLine());
        int n=1;
        
        while(n<=in){
            System.out.println(n);
            n=n*2+1;
        }
    
    
    }
}
