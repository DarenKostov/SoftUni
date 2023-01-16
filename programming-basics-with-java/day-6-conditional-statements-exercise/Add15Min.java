import java.util.Scanner;
class Add15Min{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        int hours= Integer.parseInt(scanner.nextLine());
        int seconds= Integer.parseInt(scanner.nextLine());
        
        seconds+=hours*60+15;
        
        hours=seconds/60%24;
        seconds%=60;
        
        if(seconds<10)
            System.out.println(hours+":0"+seconds);
        else
            System.out.println(hours+":"+seconds);
            

    }
}
