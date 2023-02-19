import java.util.Scanner;

class PalindromeIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        for(String num=scanner.nextLine(); !num.equals("END"); num=scanner.nextLine()){
            System.out.println(isPalendrome(num));
                

        }



    }

    static boolean isPalendrome(String in){
        for(int i=0; i<in.length(); i++){
            if(in.charAt(i)!=in.charAt(in.length()-i-1))
                return false;
        }

        return true;
    }
}
