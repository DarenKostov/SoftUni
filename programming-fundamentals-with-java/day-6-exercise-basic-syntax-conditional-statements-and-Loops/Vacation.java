import java.util.Scanner;

class Vacation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        String who=scanner.nextLine();
        String when=scanner.nextLine();
        double price=0;

        
        switch(who){
            case "Students":
                if(when.equals("Friday")){
                    price=8.45;
                }else if(when.equals("Saturday")){
                    price=9.80;
                }else if(when.equals("Sunday")){
                    price=10.46;
                }

                //discount
                if(people>=30)
                    price*=0.85;
                
                break;
            case "Business":
                if(when.equals("Friday")){
                    price=10.90;
                }else if(when.equals("Saturday")){
                    price=15.60;
                }else if(when.equals("Sunday")){
                    price=16;
                }

                //discount
                if(people>=100)
                    people-=10;
                
                break;
            case "Regular":
                if(when.equals("Friday")){
                    price=15;
                }else if(when.equals("Saturday")){
                    price=20;
                }else if(when.equals("Sunday")){
                    price=22.50;
                }

                //discount
                if(people>=10 && people <=20)
                    price*=0.95;
                
                break;
        }
            
        //get total price
        price*=people;

        System.out.printf("Total price: %.2f\n", price);
    }
}
