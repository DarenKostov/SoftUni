import java.util.Scanner;
class NumSeq{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int min=2000000;
        int max=-2000000;
        for(int i=0; i<n; i++){
            int in=Integer.parseInt(scanner.nextLine());
            if(min>in)
                min=in;
            if(max<in)
                max=in;
        }
    System.out.println("Max number: "+max);
    System.out.println("Min number: "+min);
    
        
            
    }
}
