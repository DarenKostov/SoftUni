import java.util.Scanner;

class WaterOverflow{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int capacity=255;


        for(int i=0; i<N; i++){
        
            int newWater=Integer.parseInt(scanner.nextLine());
            if(capacity-newWater<0){
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacity-=newWater;
        }
        
        System.out.println(255-capacity);
                
    }
}
