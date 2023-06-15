import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

class PredicateParty{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> guests=Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Function<String, List<String>> startsWith=(in)->{
            List<String> output=new ArrayList<>();
            for(String name : guests){
                if(name.startsWith(in)){
                    output.add(name);
                }
            }
            return output;
        };
        Function<Integer, List<String>> hasLength=(in)->{
            List<String> output=new ArrayList<>();
            for(String name : guests){
                if(name.length()==in){
                    output.add(name);
                }
            }
            return output;
        };
        Function<String, List<String>> endsWith=(in)->{
            List<String> output=new ArrayList<>();
            for(String name : guests){
                if(name.endsWith(in)){
                    output.add(name);
                }
            }
            return output;
        };



        while(true){
            String input=scanner.nextLine();
            if(input.equals("Party!")){
                break;
            }

            String[] inputs=input.split(" ");

            List<String> workingGuests;

                
            switch(inputs[1]){
                case "StartsWith":
                    workingGuests=startsWith.apply(inputs[2]);
                break;
                case "EndsWith":
                    workingGuests=endsWith.apply(inputs[2]);
                break;
                case "Length":
                    workingGuests=hasLength.apply(Integer.parseInt(inputs[2]));
                break;
                default:
                    workingGuests=new ArrayList<>();
            }
            

            if(inputs[0].equals("Remove")){
                for(String guest : workingGuests){
                    guests.removeAll(Collections.singleton(guest));
                }
            }else{
                for(String guest : workingGuests){
                        guests.add(guest);
                }
            
            
            }
                    
        
        }


        

        

        if(guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else{
            Collections.sort(guests);
            int i=0;
            for(; i<guests.size()-1; i++){
                System.out.print(guests.get(i)+", ");
            }
            System.out.println(guests.get(i)+" are going to the party!");
        }


        
    }
}
