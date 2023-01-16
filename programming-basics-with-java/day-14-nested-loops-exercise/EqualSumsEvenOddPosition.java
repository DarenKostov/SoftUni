import java.util.Scanner;
class EqualSumsEvenOddPosition{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
    
        //from n1 to n2
        for(int i=n1; i<=n2; i++){
            //make to string
            String number=""+i;
            
            //sums
            int oddSum=0;
            int evenSum=0;
            for(int j=0; j<number.length(); j++){
                             
                int digit=Integer.parseInt(""+number.charAt(j));
                
                if(j%2==0)
                    evenSum+=digit;
                else
                    oddSum+=digit;                 
            }
    
            if(oddSum==evenSum)
                System.out.print(i+" ");
        
        }
        
        
        
    
    }
}
