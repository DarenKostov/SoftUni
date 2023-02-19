import java.util.Scanner;

class CommonElements{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[][] arr=new String[2][];


        for(int i=0; i<2; i++)
            arr[i]=scanner.nextLine().split(" ");
        
        
    
            
        for(int i=0; i<arr[1].length; i++){
            
            for(int j=0; j<arr[0].length; j++){
                if(arr[1][i].equals(arr[0][j])){
                    System.out.printf("%s ", arr[1][i]);
                    break;
                }    
            }
        }
        System.out.println();
        
    }
}
