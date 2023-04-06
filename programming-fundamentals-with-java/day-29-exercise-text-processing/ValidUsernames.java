import java.util.Scanner;

class ValidUsernames{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] names=scanner.nextLine().split(", ");

        for(String name : names){
            if(rightLength(name) && onlyNumbersLettersHyphensAndunderscores(name)){
                System.out.println(name);
            }
        
        }
        

        
    }


    public static boolean rightLength(String in){
        if(in.length()>=3 && in.length()<=16)
            return true;
        return false;
    }

    public static boolean onlyNumbersLettersHyphensAndunderscores(String in){
        String lettersAndNumbers="1234567890qwertyuiopasdfghjklzxcvbnmMNBVCXZLKJHGFDSAPOIUYTREWQ-_";
        Outer:
        for(int i=0; i<in.length(); i++){
            for(int j=0; j<lettersAndNumbers.length(); j++){
                if(in.charAt(i)==lettersAndNumbers.charAt(j))
                    continue Outer;      
            }
            
            return false;
        }
        return true;
    }


    
}
