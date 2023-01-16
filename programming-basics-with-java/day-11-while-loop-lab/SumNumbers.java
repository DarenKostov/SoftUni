import java.util.Scanner;
class SumNumbers{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int goal=Integer.parseInt(scanner.nextLine());
        int i=0;
        
        while(i<goal)
            i+=Integer.parseInt(scanner.nextLine());
        System.out.println(i);
        
    }
}
