import java.util.*;

class TheHeiganDance{


    static int[] myCoords={7, 7};
    static int myHealth=18500;
    static double heiganHealth = 3000000.0;
    static boolean underEffect=false;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double myDamage=Double.parseDouble(scanner.nextLine());

        int[] gameArea={0, 0, 14, 14};

        while(true){
            String[] input=scanner.nextLine().split(" ");
            int[] heiganAttackCoords={Integer.parseInt(input[1]), Integer.parseInt(input[2])};
            int[] heiganAttackRange={heiganAttackCoords[0]-1, heiganAttackCoords[1]-1, heiganAttackCoords[0]+1, heiganAttackCoords[1]+1};


            heiganHealth-=myDamage;
            
            if(underEffect){
                myHealth-=3500;
                if(checkLossOrWin()){
                    break;
                }
                underEffect=false;
            }

            if(checkLossOrWin()){
                break;
            }
            
            //we are within attack range
            if(isWithinCoords(myCoords, heiganAttackRange)){

                
                //can we escape?
                if(!isWithinCoords(myCoords[0], myCoords[1]-1, heiganAttackRange) && isWithinCoords(myCoords[0], myCoords[1]-1, gameArea)){
                    myCoords[1]--;
                }else if(!isWithinCoords(myCoords[0]+1, myCoords[1], heiganAttackRange) && isWithinCoords(myCoords[0]+1, myCoords[1], gameArea)){
                    myCoords[0]++;
                }else if(!isWithinCoords(myCoords[0], myCoords[1]+1, heiganAttackRange) && isWithinCoords(myCoords[0], myCoords[1]+1, gameArea)){
                    myCoords[1]++;
                }else if(!isWithinCoords(myCoords[0]-1, myCoords[1], heiganAttackRange) && isWithinCoords(myCoords[0]-1, myCoords[1], gameArea)){
                    myCoords[0]--;
                }else{

                // System.out.println(Arrays.toString(myCoords));


                    if(input[0].equals("Cloud")){
                        underEffect=true;
                        myHealth-=3500;
                    }else{
                        myHealth-=6000;
                    }
                    if(checkLossOrWin()){
                        break;
                    }
                }
            
            }
        
        }

        
    }



    static boolean isWithinCoords(int[] coords, int[] area){

        if(coords[0]>=area[0] && coords[0]<=area[2]){
            if(coords[1]>=area[1] && coords[1]<=area[3]){
                return true;
            }
        }

    
        return false;
    }

    
    static boolean isWithinCoords(int coordsX, int coordsY, int[] area){

        if(coordsX>=area[0] && coordsX<=area[2]){
            if(coordsY>=area[1] && coordsY<=area[3]){
                return true;
            }
        }
        return false;
    }


    static boolean checkLossOrWin(){

        if(heiganHealth<=0){
            System.out.println("Heigan: Defeated!");
            System.out.println("Player: "+myHealth);
            System.out.printf("Final position: %d, %d\n", myCoords[0], myCoords[1]);
            return true;
        }
    
        if(myHealth<=0){
            System.out.printf("Heigan: %.2f\n", heiganHealth);

            System.out.print("Player: Killed by ");
            if(underEffect){
                System.out.println("Plague Cloud");
            }else{
                System.out.println("Eruption");
            }
            
            System.out.printf("Final position: %d, %d\n", myCoords[0], myCoords[1]);
            return true;
        }

        return false;
        
    
    
    }
    
}
