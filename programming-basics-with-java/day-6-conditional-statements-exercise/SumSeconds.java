import java.util.Scanner;
class SumSeconds{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int sec1= Integer.parseInt(scanner.nextLine());
        int sec2= Integer.parseInt(scanner.nextLine());
        int sec3= Integer.parseInt(scanner.nextLine());
        
        int totalSec=sec1+sec2+sec3;
        
        int minutes=totalSec/60%24;
        int seconds=totalSec%60;
        
        if(seconds<10)
            System.out.println(minutes+":0"+seconds);
        else
            System.out.println(minutes+":"+seconds);
            
    }
}
