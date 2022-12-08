import java.util.Scanner;
class Aquarium{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int length= Integer.parseInt(scanner.nextLine());
        int width= Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());
        double percentageToFill=Double.parseDouble(scanner.nextLine())*0.01;
        
        double volume= length*width*height*0.001;
        double volumeToFill= volume*(1-percentageToFill);
        
        System.out.println(volumeToFill);
                





    }
}
