import java.util.Scanner;
class Travelling{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String destination=scanner.nextLine();    
        
        
        
        while(!destination.equals("End")){
            double budget=Double.parseDouble(scanner.nextLine());
            
            //money saving
            while(budget>0){
                double saveMoney = Double.parseDouble(scanner.nextLine());   
                budget-=saveMoney;
            }
            
            System.out.println("Going to "+destination+"!");

            //new destination
            destination=scanner.nextLine();
        }
        
        
        
    }
}
