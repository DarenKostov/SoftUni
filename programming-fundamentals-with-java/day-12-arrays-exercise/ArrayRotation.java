import java.util.Scanner;

class ArrayRotation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        int rotations=Integer.parseInt(scanner.nextLine());

        
        int[] array=new int[input.length];
        for(int i=0; i<array.length; i++){
            array[i]=Integer.parseInt(input[i]);
        }


        for(int i=0; i<rotations; i++){
            int firstElement=array[0];
            for(int j=0; j<array.length-1; j++){
                array[j]=array[j+1];
            }
            array[array.length-1]=firstElement;
        }


        for(int element : array){
            System.out.printf("%d ", element);
        }
        System.out.println();

        
        
    }
}
