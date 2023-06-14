import java.util.*;

class Phonebook{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        Map<String, String> numbers=new HashMap<>();

        
        while(true){
            String[] input=scanner.nextLine().split("-");
            if(input[0].equals("search")){
                break;
            }

            numbers.put(input[0], input[1]);
        }


        while(true){
            String input=scanner.nextLine();
            if(input.equals("stop")){
                break;
            }

            if(numbers.containsKey(input)){
                System.out.printf("%s -> %s\n", input, numbers.get(input));
            }else{
                System.out.printf("Contact %s does not exist.\n", input);
            }

        
        }

    }
}
