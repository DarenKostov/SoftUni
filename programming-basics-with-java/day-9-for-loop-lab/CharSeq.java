import java.util.Scanner;
class CharSeq{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    String in=scanner.nextLine();
    
    for(int i=0; i<in.length(); i++)
        System.out.println(in.charAt(i));



    }
}
