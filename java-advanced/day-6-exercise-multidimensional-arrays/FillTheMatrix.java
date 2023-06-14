import java.util.*;

class FillTheMatrix{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] commands=scanner.nextLine().split(", ");
        int num=Integer.parseInt(commands[0]);
        int[][] matrix= new int[num][num];

        if(commands[1].equals("A")){
            for(int i=0; i<num*num; i++){
                matrix[i%num][i/num]=i+1;
            }
        }else{
                    
            for(int i=0; i<num*num; i++){
                matrix[(i/num)%2==0? i%num : (num-i%num-1)][i/num]=i+1;
            }
        }


        
        for (int[]  elements: matrix) {
            for (int element: elements) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        

    }
}
