import java.util.*;

class FixEmails{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails=new LinkedHashMap<>();
        
        while(true){
            String input1=scanner.nextLine();
            if(input1.equals("stop")){
                break;
            }
            String input2=scanner.nextLine();

            if(input2.endsWith(".us") || input2.endsWith(".uk") || input2.endsWith(".com")){
                continue;
            }

            emails.put(input1, input2);
        }


        for(Map.Entry<String, String> email : emails.entrySet()){
            System.out.printf("%s -> %s\n", email.getKey(), email.getValue());
        }
        

    }
}
