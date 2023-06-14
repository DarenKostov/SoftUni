import java.util.Scanner;

class ReverseMatrixDiagonals{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        String[] sizes=scanner.nextLine().split(" ");
        int sizeX=Integer.parseInt(sizes[1]);
        int sizeY=Integer.parseInt(sizes[0]);
        
        int[][] nums=new int[sizeX][sizeY];
        
        for(int y=0; y<sizeY; y++){
            String[] newNums=scanner.nextLine().split(" ");
            for(int x=0; x<sizeX; x++){
                nums[x][y]=Integer.parseInt(newNums[x]);
            }
        }

        for(int x=sizeX-1; x>=0; x--){
            for(int i=0; i<sizeY; i++){
                if(x+i>=sizeX){
                    break;
                }
                System.out.print(nums[x+i][sizeY-i-1]+" ");       
            }
            System.out.println();
        }

        for(int y=sizeY-2; y>=0; y--){
            for(int i=0; i<sizeX; i++){
                if(y-i<0){
                    break;
                }
                System.out.print(nums[i][y-i]+" ");       
            }
            System.out.println();
        }

    }
}
