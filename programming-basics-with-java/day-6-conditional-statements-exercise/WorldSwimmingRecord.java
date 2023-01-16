import java.util.Scanner;
class WorldSwimmingRecord{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        
        //in seconds
        double RecordTime=Double.parseDouble(scanner.nextLine());
        //in meters
        double distance=Double.parseDouble(scanner.nextLine());
        //in s/m, not m/s
        double reverseSpeed=Double.parseDouble(scanner.nextLine());
        
        //how much does the resistance slow down in sec
        double resistanceTime=Math.floor(distance/15)*12.5;
        
        double totalTime=resistanceTime+reverseSpeed*distance;
        
        double difference=totalTime-RecordTime;
        
        if(difference<0)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.\n", totalTime);
        
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.\n", difference);
        
    }
}
