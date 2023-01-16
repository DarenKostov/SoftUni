import java.util.Scanner;
class Workout{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int days= Integer.parseInt(scanner.nextLine());
        double kmiThDay= Double.parseDouble(scanner.nextLine());
        double totalKm=kmiThDay;
        
        for(int i=0; i<days; i++){
            double percent=1+(0.01*Integer.parseInt(scanner.nextLine()));
            
            kmiThDay*=percent;
            totalKm+=kmiThDay;
        }
        
        double diff=1000-totalKm;
        
        
        if(diff<=0)
            System.out.printf("You've done a great job running %.0f more kilometers!\n", Math.ceil(Math.abs(diff)));
        else
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers\n", Math.ceil(diff));
        
    }
}
