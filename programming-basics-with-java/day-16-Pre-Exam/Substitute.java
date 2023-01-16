import java.util.Scanner;
class Substitute{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int K=Integer.parseInt(scanner.nextLine());
        int L=Integer.parseInt(scanner.nextLine());
        int M=Integer.parseInt(scanner.nextLine());
        int N=Integer.parseInt(scanner.nextLine());
    
        boolean invalid=false;
        boolean samePlayer=false;
        
        int count=6;
        
        outerLoop:
        for(int k=K; k<9; k++)
            for(int l=9; l>=L; l--)
                for(int m=M; m<9; m++)
                    for(int n=9; n>=N; n--){

                        // System.out.printf("==%d%d - %d%d\n", k, l, m, n);
                        invalid=false;
                        samePlayer=false;
                        //if 1st digit is not even
                        if(k%2==1)
                            invalid=true;

                        if(m%2==1)
                            invalid=true;
                            
                        //if 2nd digit is not odd
                        if(l%2==0)
                            invalid=true;
                        if(n%2==0)
                            invalid=true;
                    
                        //if they are the same    
                        if(k==m && l==n)
                            samePlayer=true;
                            
                        if(!invalid)
                            if(samePlayer)
                                System.out.println("Cannot change the same player.");
                            else{
                                System.out.printf("%d%d - %d%d\n", k, l, m, n);
                                count--;
                            }
                        if(count==0)
                            break outerLoop;
                    
                    
                    
                    }
    
    
    
    
    }
}
