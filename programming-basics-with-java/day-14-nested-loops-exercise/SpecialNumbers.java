import java.util.Scanner;
class SpecialNumbers{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        
        for(int i=1; i<10; i++){
            if(num%i==0)
                for(int j=1; j<10; j++){
                    if(num%j==0)
                        for(int k=1; k<10; k++){
                            if(num%k==0)
                                for(int l=1; l<10; l++){
                                    if(num%l==0)
                                        System.out.print(""+i+j+k+l+" ");
                    
                    
                                }
                        }
                }
        }
        
        
    }
}
