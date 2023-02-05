import java.util.Scanner;

class Login{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userName=scanner.nextLine();
        String password="";
        boolean blocked=true;

        
        for(int i=0; i<userName.length(); i++){
            password+=userName.charAt(userName.length()-i-1);
        }
        
        for(int i=0; i<4; i++){
            if(scanner.nextLine().equals(password)){
                blocked=false;
                break;
            }

            if(i==3)
                break;
            
            System.out.println("Incorrect password. Try again.");
            
        }

        if(blocked)
            System.out.printf("User %s blocked!\n", userName);
        else
            System.out.printf("User %s logged in.\n", userName);



        
    }
}
