import java.util.Scanner;

class MatrixShuffling{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        String[] sizes=scanner.nextLine().split(" ");
        int sizeX=Integer.parseInt(sizes[0]);
        int sizeY=Integer.parseInt(sizes[1]);

        String[][] matrix=new String[sizeX][sizeY];


        for(int x=0; x<sizeX; x++){
            String[] newNums=scanner.nextLine().split(" ");
            for(int y=0; y<sizeY; y++){
                matrix[x][y]=newNums[y];
            }
        }





        while(true){
            String[] commands=scanner.nextLine().split(" ");

            if(commands[0].equals("END")){
                break;
            }

            
            if(commands.length!=5){
                System.out.println("Invalid input!");
                continue;
            }


            int coord1X=Integer.parseInt(commands[1]);
            int coord1Y=Integer.parseInt(commands[2]);
            int coord2X=Integer.parseInt(commands[3]);
            int coord2Y=Integer.parseInt(commands[4]);


            if(coord1X<0 || coord1X>sizeX-1 ||
            coord1Y<0 || coord1Y>sizeY-1 ||
            coord2X<0 || coord2X>sizeX-1 ||
            coord2Y<0 || coord2Y>sizeY-1){
                System.out.println("Invalid input!");
                continue;
            }

        
            String tmp=matrix[coord1X][coord1Y];
            matrix[coord1X][coord1Y]=matrix[coord2X][coord2Y];
            matrix[coord2X][coord2Y]=tmp;

            

            for (String[]  elements: matrix) {
                for (String element: elements) {
                    System.out.print(element+" ");
                }
                System.out.println();
            }
            
        }
        


    }
}
