import java.util.Scanner;

class CaesarCipher{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();


        for(int i=0; i<str.length(); i++){
            System.out.print((char)(str.charAt(i)+3));
        
        }
        
    }
}
