import java.util.Scanner;

class PasswordValidator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password=scanner.nextLine();
        boolean valid=true;

        if(!rightLength(password))
            valid=false;
        if(!onlyNumbersAndLetters(password))
            valid=false;
        if(!has2Digits(password))
            valid=false;

        if(valid){
            System.out.println("Password is valid");
        }
        
        

    }


    public static boolean rightLength(String in){
        if(in.length()>=6 && in.length()<=10)
            return true;
        System.out.println("Password must be between 6 and 10 characters");            
        return false;
    }

    public static boolean onlyNumbersAndLetters(String in){
        String lettersAndNumbers="1234567890qwertyuiopasdfghjklzxcvbnmMNBVCXZLKJHGFDSAPOIUYTREWQ";
        Outer:
        for(int i=0; i<in.length(); i++){
            for(int j=0; j<lettersAndNumbers.length(); j++){
                if(in.charAt(i)==lettersAndNumbers.charAt(j))
                    continue Outer;      
            }
            System.out.println("Password must consist only of letters and digits");  
            
            return false;
        }
        return true;
    }

    public static boolean has2Digits(String in){
        int digitsCount=0;

        for(int i=0; i<in.length(); i++){
            if(in.charAt(i)>='0' && in.charAt(i)<='9'){
                digitsCount++;
                if(digitsCount>=2){
                    return true;
                }
            }
            
        }
        System.out.println("Password must have at least 2 digits");
        return false;
            
    }

    
}
