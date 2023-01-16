import java.util.Scanner;
class Shopping{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        double budget=Double.parseDouble(scanner.nextLine());
        int gpus=Integer.parseInt(scanner.nextLine());
        int cpus=Integer.parseInt(scanner.nextLine());
        int rams=Integer.parseInt(scanner.nextLine());
        
        //gpu
        double gpusPrice=gpus*250;
        
        //cpu
        double cpusPrice=gpusPrice*0.35;
        cpusPrice*=cpus;
        
        //ram
        double ramsPrice=gpusPrice*0.10;
        ramsPrice*=rams;
    
        double totalPrice=gpusPrice+cpusPrice+ramsPrice;
        
        if(gpus>cpus)
            totalPrice*=0.85;
            
        double difference=budget-totalPrice;
        
        if(difference>=0)
            System.out.printf("You have %.2f leva left!\n", difference);
        else
            System.out.printf("Not enough money! You need %.2f leva more!\n", -difference);
    
            
    }
}
