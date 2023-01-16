import java.util.Scanner;
class EasterExcursion{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();
        String dates=scanner.nextLine();
        int stays=Integer.parseInt(scanner.nextLine());
        
        double totalPrice=0;
        
        
        //set initial price depending on country and dates
        switch(country){
            case "France":
                switch(dates){
                    case "21-23":
                        totalPrice=30;
                        break;
                    case "24-27":
                        totalPrice=35;
                        break;
                    case "28-31":
                        totalPrice=40;
                }
                break;
            case "Italy":
                switch(dates){
                    case "21-23":
                        totalPrice=28;
                        break;
                    case "24-27":
                        totalPrice=32;
                        break;
                    case "28-31":
                        totalPrice=39;
                }
                break;
            case "Germany":
                switch(dates){
                    case "21-23":
                        totalPrice=32;
                        break;
                    case "24-27":
                        totalPrice=37;
                        break;
                    case "28-31":
                        totalPrice=43;
                }
                break;
        }
        
        
        totalPrice*=stays;
        
        System.out.printf("Easter trip to %s : %.2f leva.\n", country, totalPrice);
        
        
    }
}
