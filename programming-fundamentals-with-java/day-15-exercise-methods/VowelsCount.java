import java.util.Scanner;

class VowelsCount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String txt=scanner.nextLine();
        printCountOfVowels(txt);    
    }
    public static void printCountOfVowels(String in){
        int vowelsCount=0;
        String vowels="AaIiOoUuEe";


        for(int i=0; i<in.length(); i++)
            for(int j=0; j<vowels.length(); j++)
                if(in.charAt(i)==vowels.charAt(j)){
                    vowelsCount++;
                    break;
                }

        System.out.println(vowelsCount);
    }
}
