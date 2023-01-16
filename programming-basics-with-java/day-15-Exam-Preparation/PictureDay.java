import java.util.Scanner;
class PictureDay{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        
        int picturesTime=Integer.parseInt(scanner.nextLine());
        int scenes=Integer.parseInt(scanner.nextLine());
        int sceneTime=Integer.parseInt(scanner.nextLine());
        
        int terrainPreparationTime=(15*picturesTime)/100;
        int timeToShootScenes=scenes*sceneTime;
        int totalTime=terrainPreparationTime+timeToShootScenes;     
        
        int difference=totalTime-picturesTime;
        
        if(difference<0){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!\n", Math.abs(difference));

        }else{
            System.out.printf("Time is up! To complete the movie you need %d minutes.\n", difference);
        }  
                        
        
    }
}
