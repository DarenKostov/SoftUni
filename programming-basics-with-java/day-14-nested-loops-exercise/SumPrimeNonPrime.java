import java.util.Scanner;
class SumPrimeNonPrime{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String action=scanner.nextLine();
        int primeSum=0;
        int nonPrimeSum=0;
        
        
        
        
        while(!action.equals("stop")){
            //convert to int
            int num=Integer.parseInt(action);

            if(num<0){
                System.out.println("Number is negative.");

                                                                
            //if its not negative
            }else{
                boolean isPrime=true;
                //check if its devisible by any number other than 1 and itself
                for(int i=2; i<num; i++){
                    if(num%i==0){
                    isPrime=false;
                    break;
                    }
                            
                }
                
                //do action acoording if its prime or not
                if(isPrime)
                    primeSum+=num;
                else
                    nonPrimeSum+=num;         
                            
            }
       
        
        //get new num
        action=scanner.nextLine();
                
        }
        
        
        System.out.println("Sum of all prime numbers is: "+primeSum);
        System.out.println("Sum of all non prime numbers is: "+nonPrimeSum);
        
    }
}
