import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ListOperations{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] input=scanner.nextLine().split(" ");

        while(!input[0].equals("End")){
        
            switch(input[0]){
                case "Add":
                    nums.add(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    Integer value=Integer.parseInt(input[1]);
                    int index=Integer.parseInt(input[2]);

                    
                    if(index<0 || index>=nums.size()){
                        System.out.println("Invalid index");
                        break;
                    }
                    
                    nums.add(index, value);
                    break;
                case "Remove":
                    index=Integer.parseInt(input[1]);

                    if(index<0 || index>=nums.size()){
                        System.out.println("Invalid index");
                        break;
                    }
                    
                    nums.remove(index);
                    break;
                case "Shift":
                    int N=Integer.parseInt(input[2]);
                    if(input[1].equals("left")){
                        for(int i=0; i<N; i++){
                            Integer tmp=nums.get(0);
                            nums.remove(0);
                            nums.add(tmp);
                        }
                    }else{
                        for(int i=0; i<N; i++){
                            Integer tmp=nums.get(nums.size()-1);
                            nums.remove(nums.size()-1);
                            nums.add(0, tmp);
                        }
                    }
                    break;
            }

            
            input=scanner.nextLine().split(" ");
        }
        
        for(int num : nums){
            System.out.printf("%d ", num);
        }

        System.out.println();

    }
}
