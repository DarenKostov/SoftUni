import java.util.Scanner;
class Cake{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        
        
        int slices=length*width;
        
        
        while(slices>0){
            String action=scanner.nextLine();
            
            if(action.equals("STOP"))
                break;
                
            slices-=Integer.parseInt(action);
        
        }
        
        
        if(slices>0){
            System.out.println(slices+" pieces are left.");
        }else{
            System.out.println("No more cake left! You need "+Math.abs(slices)+" pieces more.");
        }
        
        
    }
}
