import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

class CoffeeLover{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> coffees=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int AmountOfCommnds=Integer.parseInt(scanner.nextLine());

        for(int i=0; i<AmountOfCommnds; i++){
            String[] input=scanner.nextLine().split(" ");
            switch(input[0]){
                case "Include":
                    coffees.add(input[1]);
                    break;
                case "Remove":
                    int count=Integer.parseInt(input[2]);

                    //dont execute if more we want to remove more cofees than there actualy are
                    if(count>coffees.size())
                        break;


                    
                    if(input[1].equals("last")){
                        for(int j=0; j<count; j++){
                            coffees.remove(coffees.size()-1);                            
                        }
                    }else{
                        for(int j=0; j<count; j++){
                            coffees.remove(0);                            
                        }
                    }

                
                    break;
                case "Prefer":
                    int index1=Integer.parseInt(input[1]);
                    int index2=Integer.parseInt(input[2]);

                    //either index is out of bounds
                    if(index1<0 || index2<0 || index2>coffees.size()-1 || index2>coffees.size()-1)
                        break;

                    String temp=coffees.get(index1);
                    coffees.set(index1, coffees.get(index2));
                    coffees.set(index2, temp);
                    
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
                default:
                    System.out.println("error");
            }
        }

        System.out.println("Coffees:");
        for(String name : coffees)
            System.out.printf("%s ", name);
        System.out.println("");
        

    }
}
