import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        String[] sizes=scanner.nextLine().split("\\s+");
        int[][] galaxy= new int[Integer.parseInt(sizes[0])][Integer.parseInt(sizes[1])];

        int stars=0;
        int i=0;
        for(int r=0; r<galaxy.length; r++){
            for(int c=0; c<galaxy[0].length; c++){
                galaxy[r][c]=i++;
            }
        }
        
  
        
        while(true){

        
            String command=scanner.nextLine();
            if(command.equals("Let the Force be with you")){
                break;
            }
            String[] playerCoordsString=command.split(" ");
            String[] evilCoordsString=scanner.nextLine().split(" ");
            
            int[] playerCoords=new int[2];
            int[] evilCoords=new int[2];

            playerCoords[0]=Integer.parseInt(playerCoordsString[0]);
            playerCoords[1]=Integer.parseInt(playerCoordsString[1]);

            evilCoords[0]=Integer.parseInt(evilCoordsString[0]);
            evilCoords[1]=Integer.parseInt(evilCoordsString[1]);

            while(evilCoords[0]>=0 && evilCoords[1]>=0){
                if(withinBounds(galaxy, evilCoords)){
                    // System.out.println(galaxy[evilCoords[0]][evilCoords[1]]);
                    galaxy[evilCoords[0]][evilCoords[1]]=0;
                }
                // System.out.println(evilCoords[0]+", "+evilCoords[1]);
                evilCoords[0]--;
                evilCoords[1]--;
            }

            // System.out.println("ewbhdehdbhfbhdbhfbdbsbdfbsh");

             while(playerCoords[0]>=0 && playerCoords[1]<galaxy[0].length){
                if(withinBounds(galaxy, playerCoords)){
                    stars+=galaxy[playerCoords[0]][playerCoords[1]];
                    // System.out.println(galaxy[playerCoords[0]][playerCoords[1]]);
                }
                // System.out.println(playerCoords[0]+", "+playerCoords[1]);
                playerCoords[0]--;
                playerCoords[1]++;
            }

            
        }

        System.out.println(stars);
    }


    public static boolean withinBounds(int[][] galaxy, int[] coords){

        if(coords[0]>=galaxy.length)
            return false;
        if(coords[0]<0)
            return false;
        if(coords[1]>=galaxy[0].length)
            return false;
        if(coords[1]<0)
            return false;

        return true;
    }
    
}
