import java.util.Scanner;

class ReplaceRepeatingChars{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        char previous=' ';
        for(int i=0; i<str.length(); i++){
            char currentChar=str.charAt(i);

            if(previous!=currentChar){
                System.out.print(currentChar);
            }
            previous=currentChar;
        
        }
        System.out.println();

    }
}
