import java.util.Scanner;

public class Zoomarket{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int dogFoodAmount= Integer.parseInt(scanner.nextLine());
        int catFoodAmount= Integer.parseInt(scanner.nextLine());
    
        float sum= dogFoodAmount*2.5f+catFoodAmount*4;
        
        System.out.println(sum+" lv.");
    }
}