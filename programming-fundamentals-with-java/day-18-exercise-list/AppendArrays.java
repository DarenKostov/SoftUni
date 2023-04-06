import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class AppendArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] arrs=scanner.nextLine().split("\\|");

        for(int i=arrs.length-1; i>=0; i--){

            for(int j=0; j<arrs[i].length(); j++){
                if(arrs[i].charAt(j)==' ')
                    continue;
                System.out.print(arrs[i].charAt(j)+" ");
            }
            
            // System.out.println(String.join(" ", currentArr));
        
        }

    }
}
