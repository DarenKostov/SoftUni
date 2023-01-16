import java.util.Scanner;
class Coins{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //change in stotinki
        int change=(int)(100*Double.parseDouble(scanner.nextLine()));
        int coins=0;
        
        
        
        
        //2 leva, 200 stotinki
        while(change-200>=0){
            change-=200;
            coins++;
        }
        //1 lev, 100 stotinki
        while(change-100>=0){
            change-=100;
            coins++;
        }
        //50 stitinki
        while(change-50>=0){
            change-=50;
            coins++;
        }
        //20 stotinki
        while(change-20>=0){
            change-=20;
            coins++;
        }
        //10 stotinki
        while(change-10>=0){
            change-=10;
            coins++;
        }
        //5 stotinki
        while(change-5>=0){
            change-=5;
            coins++;
        }
        //2 stotinki
        while(change-2>=0){
            change-=2;
            coins++;
        }
        //1 stotinka
        while(change-1>=0){
            change-=1;
            coins++;
        }
        
        System.out.println(coins);
        
    }
}
