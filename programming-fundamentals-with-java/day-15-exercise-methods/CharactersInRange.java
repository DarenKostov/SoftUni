import java.util.Scanner;

class CharactersInRange{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char char1=scanner.nextLine().charAt(0);
        char char2=scanner.nextLine().charAt(0);

        printInBetween(char1, char2);
        
    }
    public static void printInBetween(char c1, char c2){
        if(c2<c1){
            char tmp=c2;
            c2=c1;
            c1=tmp;
        }
    
        for(char i=(char)(c1+1); i<c2; i++)
            System.out.printf("%c ", i);

    }
}
