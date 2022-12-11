import java.util.Scanner;
class Excursion{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int peopleGroups=Integer.parseInt(scanner.nextLine());
        int stays=Integer.parseInt(scanner.nextLine());
        int maps=Integer.parseInt(scanner.nextLine());
        int tickets=Integer.parseInt(scanner.nextLine());
        
        double totalPrice=(stays*20+maps*1.60+tickets*6)*peopleGroups;
        totalPrice*=1.25;
        System.out.printf("%.2f\n",totalPrice);
    
    }
}
