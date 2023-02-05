import java.util.Scanner;

class TriplesOfLatinLetters{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());



        for(int i='a'; i<num+'a'; i++){
            for(int j='a'; j<num+'a'; j++){
                for(int k='a'; k<num+'a'; k++){
                    System.out.printf("%c%c%c\n", i, j, k);
                }
            }
        }
        
    }
}
