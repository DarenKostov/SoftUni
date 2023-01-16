import java.util.Scanner;
class Moving{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        
        int freeSpace=length*width*height;
        
        while(freeSpace>0){
            String action=scanner.nextLine();
            
            if(action.equals("Done"))
                break;
            
            freeSpace-=Integer.parseInt(action);
            
        }
        
        if(freeSpace>0)
            System.out.println(freeSpace+" Cubic meters left.");
        else
            System.out.println("No more free space! You need "+Math.abs(freeSpace)+" Cubic meters more.");
        
        
    }
}
