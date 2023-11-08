import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String[] colors=scanner.nextLine().split("\\s+");
        int num=Integer.parseInt(scanner.nextLine());

        
        TrafficLight[] lights=new TrafficLight[colors.length];
        for(int i=0; i<colors.length; i++){
            lights[i]=new TrafficLight(TrafficColor.valueOf(colors[i]));
        }


        
        for(int i=0; i<num; i++){
            for(int j=0; j<colors.length; j++){
                lights[j].updateColor();
                System.out.print(lights[j].getColor()+" ");

            }
            System.out.println();
        }


                
    }
}
