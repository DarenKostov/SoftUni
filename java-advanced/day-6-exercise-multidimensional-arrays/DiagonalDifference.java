import java.util.Scanner;

class DiagonalDifference{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num=Integer.parseInt(scanner.nextLine());
        int[][] nums=new int[num][num];
        int sum=0;

        for(int i=0; i<num; i++){

            String[] newNums=scanner.nextLine().split(" ");
            for(int j=0; j<num; j++){
                nums[i][j]=Integer.parseInt(newNums[j]);
            }
        }


        for(int i=0; i<num; i++){
            sum+=nums[i][i];
            sum-=nums[i][num-i-1];
        }

        System.out.println(Math.abs(sum));

        
        
    }
}
