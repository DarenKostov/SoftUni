import java.util.Scanner;
class MinNumber{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int min=2000000;
        
        while(!input.equals("Stop")){
            min=Math.min(min, Integer.parseInt(input));
            input=scanner.nextLine();
        }
        System.out.println(min);
        
    }
}
