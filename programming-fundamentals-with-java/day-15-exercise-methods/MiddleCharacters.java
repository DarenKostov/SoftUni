import java.util.Scanner;

class MiddleCharacters{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        printMiddle(text);
    }

    public static void printMiddle(String in){
        
        if(in.length()%2==0)
            System.out.print(in.charAt(in.length()/2-1));
        System.out.print(in.charAt(in.length()/2));
        System.out.println();
    
    }
}
