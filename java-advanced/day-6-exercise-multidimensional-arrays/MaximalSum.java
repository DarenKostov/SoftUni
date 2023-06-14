import java.util.Scanner;



class MaximalSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] sizes=scanner.nextLine().split(" ");
        int sizeX=Integer.parseInt(sizes[0]);    
        int sizeY=Integer.parseInt(sizes[1]);    

        if(sizeX<3 || sizeY<3){
            return;
        }

        
        int[][] nums=new int[sizeX][sizeY];


        for(int x=0; x<sizeX; x++){
        String[] newNums=scanner.nextLine().split(" ");
            for(int y=0; y<sizeY; y++){
                nums[x][y]=Integer.parseInt(newNums[y]);
            }
        }

        int maxX=0, maxY=0, maxSum=Integer.MIN_VALUE;
        
        //find maximum
        for(int x=0; x<sizeX-2; x++){
            for(int y=0; y<sizeY-2; y++){
                int localSum=0;

                for(int localX=x; localX<x+3; localX++){
                    for(int localY=y; localY<y+3; localY++){
                        localSum+=nums[localX][localY];
                    }
                }

                if(localSum>maxSum){
                    maxSum=localSum;
                    maxX=x;
                    maxY=y;
                }

                
            }
        }

        

        System.out.println("Sum = "+maxSum);

        for(int x=maxX; x<maxX+3; x++){
            for(int y=maxY; y<maxY+3; y++){
                System.out.print(nums[x][y]+" ");
            }
            System.out.println();
        }

        

    }
}
