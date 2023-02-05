import java.util.Scanner;

class Elevator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int peopleCount=Integer.parseInt(scanner.nextLine());
        int elevatorCapacity=Integer.parseInt(scanner.nextLine());
        int trips=0;


        trips=(int)Math.ceil((0.0+peopleCount)/elevatorCapacity);
    
        System.out.println(trips);
        
    }
}
