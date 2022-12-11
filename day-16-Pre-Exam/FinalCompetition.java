import java.util.Scanner;
class FinalCompetition{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int dancers=Integer.parseInt(scanner.nextLine());
        double points=Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        String place=scanner.nextLine();
        
        double price=points*dancers;
        
        if(place.equals("Abroad")){
            price*=1.5;
            if(season.equals("summer"))
                price*=0.9;
            if(season.equals("winter"))
                price*=0.85;
        }else{//Bulgaria
            if(season.equals("summer"))
                price*=0.95;
            if(season.equals("winter"))
                price*=0.92;
        }
        
        price/=4;
        System.out.printf("Charity - %.2f\n", price*3);        
        System.out.printf("Money per dancer - %.2f\n", price/dancers);        
        

        
        
            
        
    }
}
