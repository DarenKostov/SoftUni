import java.util.Scanner;
class Darts{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String player= scanner.nextLine();
        String action= scanner.nextLine();
        int totalScore=301;
        int successfulShots=0;
        int unsuccessfulShots=0;
        
        
        while(!action.equals("Retire")){
            int score=Integer.parseInt(scanner.nextLine());
            

            
            switch(action){
                case "Single":
                    //do nothing
                    break;
                case "Double":
                    score*=2;
                    break;
                case "Triple":
                    score*=3;
            }
            
            
            int difference=totalScore-score;
            
            if(difference==0){//final shot
                successfulShots++;
                totalScore=0;
                break;
            }else if(difference<0)//score would be negative, unsuccessful shot
                unsuccessfulShots++;
            else{//still lowering the score
                successfulShots++;
                totalScore=difference;
            }
            action= scanner.nextLine();
            
        }
        
        if(totalScore==0)
            System.out.printf("%s won the leg with %d shots.\n", player, successfulShots);
        else
            System.out.printf("%s retired after %d unsuccessful shots.\n", player, unsuccessfulShots);
        
        
    }
}
