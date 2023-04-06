import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PhoneShop{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> phones=Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String[] input=scanner.nextLine().split(" ");

        while(!input[0].equals("End")){
            switch(input[0]){
                case "Add":
                    //does the phone already exist?
                    if(phones.contains(input[2])){
                        break;
                    }
                    // break;
                        
                    phones.add(input[2]);
                    
                    break;
                case "Remove":
                    phones.remove(input[2]);//======
                    break;
                case "Bonus":
                    String[] inputPhones=input[3].split(":");
                    int index;

                    //does the old phone exist in the first place?
                    if(!phones.contains(inputPhones[0]))
                        break;

                    index=phones.indexOf(inputPhones[0]);
                    phones.add(index+1, inputPhones[1]);
                    
                    
                    
                    break;
                case "Last":
                    
                    //does the phone exist in the first place?
                    if(!phones.contains(input[2]))
                        break;

                    phones.remove(input[2]);
                    phones.add(input[2]);
            
                    break;
                default:
                    System.out.println("err");
                    break;
            }
            input=scanner.nextLine().split(" ");
        }



        System.out.println(phones.toString().replace("[", "").replace("]", ""));


    }
}
