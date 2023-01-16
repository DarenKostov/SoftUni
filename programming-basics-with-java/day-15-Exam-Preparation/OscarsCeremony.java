import java.util.Scanner;
class OscarsCeremony{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int roomRent=Integer.parseInt(scanner.nextLine());
        
        double statuettes= 0.7*roomRent;
        double catering= statuettes*0.85;
        double voicing= catering/2;
        
        double totalPrice=roomRent+statuettes+catering+voicing;
        
        System.out.printf("%.2f\n", totalPrice);
        
        
        
    }
}
