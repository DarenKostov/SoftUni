import java.util.Scanner;

class Train{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int sum=0;

        
        int[] wagon=new int[N];

        for(int i=0; i<N; i++){
          sum+=wagon[i]=Integer.parseInt(scanner.nextLine());
        }

        
        for(int i=0; i<N; i++){
            System.out.printf("%d ", wagon[i]);
        }    

        System.out.printf("\n%d\n", sum);
        
    }
    
}
