import java.util.Scanner;

public class ProjectTimeCalc{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String architect= scanner.nextLine();
        int projects= Integer.parseInt(scanner.nextLine());
        int hours= projects*3;
        
        System.out.println("The architect "+architect+" will need "+hours+" hours to complete "+projects+" project/s.");
    }
}