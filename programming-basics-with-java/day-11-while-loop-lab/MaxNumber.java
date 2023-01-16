import java.util.Scanner;
class MaxNumber{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int max=-2000000;
        
        while(!input.equals("Stop")){
            max=Math.max(max, Integer.parseInt(input));
            input=scanner.nextLine();
        }
        System.out.println(max);
        
    }
}
