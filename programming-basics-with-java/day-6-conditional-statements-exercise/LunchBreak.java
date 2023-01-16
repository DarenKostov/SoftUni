import java.util.Scanner;
class LunchBreak{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        String name=scanner.nextLine();
        int episodeDuration=Integer.parseInt(scanner.nextLine());
        int breakDuration=Integer.parseInt(scanner.nextLine());
        
        double lunchDuration=breakDuration*0.125;
        
        
        double freeTime=breakDuration-lunchDuration-breakDuration*0.25;
        
        double difference=freeTime-episodeDuration;
         
        if(difference>=0)
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.\n", name, Math.ceil(difference));
        
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.\n", name, Math.ceil(-difference));
        
    }
}
