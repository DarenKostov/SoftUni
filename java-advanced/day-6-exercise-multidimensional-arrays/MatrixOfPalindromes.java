import java.util.Scanner;

class MatrixOfPalindromes{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] rowNCol=scanner.nextLine().split(" ");

        int rows=Integer.parseInt(rowNCol[1]);
        int cols=Integer.parseInt(rowNCol[0]);

        String[][] matrix= new String[cols][rows];

        for(int x=0; x<cols; x++){
            for(int y=0; y<rows; y++){
                matrix[x][y]="";
                matrix[x][y]+=(char)('a'+x);
                matrix[x][y]+=(char)('a'+x+y);
                matrix[x][y]+=(char)('a'+x);
            }
        }


        for (String[]  elements: matrix) {
            for (String element: elements) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        
        
    }
}
