import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ChangeList{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] input=scanner.nextLine().split(" ");


        while(!input[0].equals("end")){
            switch(input[0]){
                case "Insert":
                    Integer value=Integer.parseInt(input[1]);
                    int index=Integer.parseInt(input[2]);
                    nums.add(index, value);
                    break;
                case "Delete":
                    value=Integer.parseInt(input[1]);
                    nums.removeAll(Arrays.asList(value));
            }
            
            input=scanner.nextLine().split(" ");
        }

        for(int num : nums){
            System.out.printf("%d ", num);
        }
        System.out.println();

        
    }
}
