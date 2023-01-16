import java.util.Scanner;
class Area{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        String shape=scanner.nextLine();
        //side can be radius too
        double side=Double.parseDouble(scanner.nextLine());
        double area=0;
        
        if(shape.equals("square"))
            area=side*side;
        else if(shape.equals("rectangle")){
            double height=Double.parseDouble(scanner.nextLine());
            area=height*side;
        }else if(shape.equals("circle"))
            area=Math.PI*side*side;
        else if(shape.equals("triangle")){
            double height=Double.parseDouble(scanner.nextLine());
            area=side*height/2;
        }
        
        System.out.printf("%.3f\n",area);
        
    }
}
