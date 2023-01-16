import java.util.Scanner;
class EasterEggs{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int count= Integer.parseInt(scanner.nextLine());
        
        int redEggs=0;
        int orangeEggs=0;
        int blueEggs=0;
        int greenEggs=0;
        int maxEggs=0;
        String maxEggsName="";
        
        
        //get amounts
        for(int i=0; i<count; i++){
            switch(scanner.nextLine()){
                case "red":
                    redEggs++;
                    break;
                case "orange":
                    orangeEggs++;
                    break;
                case "blue":
                    blueEggs++;
                    break;
                case "green":
                    greenEggs++;
                    break;
            }
        }
        //see which amount is tge largest
        if(maxEggs<redEggs){
            maxEggsName="red";
            maxEggs=redEggs;   
        }
        if(maxEggs<orangeEggs){
            maxEggsName="orange";
            maxEggs=orangeEggs;   
        }
        if(maxEggs<greenEggs){
            maxEggsName="green";
            maxEggs=greenEggs;   
        }
        if(maxEggs<blueEggs){
            maxEggsName="blue";
            maxEggs=blueEggs;   
        }
        
       System.out.println("Red eggs: "+redEggs); 
       System.out.println("Orange eggs: "+orangeEggs); 
       System.out.println("Blue eggs: "+blueEggs); 
       System.out.println("Green eggs: "+greenEggs); 
       System.out.println("Max eggs: "+maxEggs+" -> "+maxEggsName); 
        
    }
}
