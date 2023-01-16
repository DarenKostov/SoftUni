import java.util.Scanner;
class NumberPyramid{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        
        int count=1;
        
        
        
        rows:
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(count>n)
                    break rows;
                
                System.out.print(count+" ");
                count++;
            
            }
            System.out.println();
        }
        
    }
    
}
