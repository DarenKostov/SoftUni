import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class HouseParty{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<String>();
        int amountOfCommands=Integer.parseInt(scanner.nextLine());



        for(int i=0; i<amountOfCommands; i++){
            String[] input=scanner.nextLine().split(" ");            
            String name=input[0];
            boolean isGoing=input[2].equals("not")? false: true;
            boolean onTheList=people.contains(name);

            
            if(isGoing){
                if(onTheList){
                    System.out.printf("%s is already in the list!\n", name);
                    continue;
                }
                people.add(name);
            }else{
                if(onTheList){
                    people.remove(name);
                    continue;
                }
                    System.out.printf("%s is not in the list!\n", name);
            }
        }

        for(String name : people){
            System.out.printf("%s\n", name);
        }
        



            
    
    }
}
