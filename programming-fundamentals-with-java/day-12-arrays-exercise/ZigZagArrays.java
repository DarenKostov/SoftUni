import java.util.Scanner;

class ZigZagArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int[][] arr= new int[2][num];

        for(int i=0; i<num; i++){
            String[] input=scanner.nextLine().split(" ");

            for(int j=0; j<2; j++){
                arr[j][i]=Integer.parseInt(input[(i+j)%2]);
            }
        }
                    
        for(int[] array : arr){
            for(int element : array){
                System.out.printf("%d ", element);
            }
            System.out.println();
        }

                

    }
}
