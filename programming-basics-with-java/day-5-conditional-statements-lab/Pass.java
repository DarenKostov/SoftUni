import java.util.Scanner;
class Pass{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        String input=scanner.nextLine();
        
        
        if(input.equals("s3cr3t!P@ssw0rd"))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
        
        
        
    }
}