import java.util.Scanner;
class Repainting{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        double nylon= (2+Integer.parseInt(scanner.nextLine()))*1.5;
        double paint= 1.1*Integer.parseInt(scanner.nextLine())*14.5;
        double thinner= Integer.parseInt(scanner.nextLine())*5.0;
        int hours= Integer.parseInt(scanner.nextLine());
        
        double materialsPrice= nylon+paint+thinner+0.4;
        
        double worker=materialsPrice*0.3*hours;
        
        double totalPrice= materialsPrice+worker;
        
        System.out.println(totalPrice);
        
        
    }
}
