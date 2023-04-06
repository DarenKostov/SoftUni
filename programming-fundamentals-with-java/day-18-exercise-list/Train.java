import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Train{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capacity=Integer.parseInt(scanner.nextLine());
        
        String input=scanner.nextLine();



        while(!input.equals("end")){
        
            if(input.startsWith("Add")){
                wagons.add(Integer.parseInt(input.split(" ")[1]));        
            }else{
                int passengers=Integer.parseInt(input);

                for(int i=0; i<wagons.size(); i++){
                    if(wagons.get(i)+passengers<=capacity){
                        wagons.set(i, wagons.get(i)+passengers);
                        break;
                    }
                
                }
            }
            input=scanner.nextLine();
        }

        System.out.println(wagons.toString().replace("[", "").replace("]", "").replace(",", ""));
        
    
    }
}
