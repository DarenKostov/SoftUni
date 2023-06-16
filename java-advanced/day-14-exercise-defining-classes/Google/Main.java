import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people=new LinkedHashMap<>();

        
        while(true){
        
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("End")){
                break;
            }

            people.putIfAbsent(input[0], new Person());
                
            switch(input[1]){
                case "company":
                    people.get(input[0]).addCompany(input[2], input[3], input[4]); 
                    break;
                case "pokemon":
                    people.get(input[0]).addPokemon(input[2], input[3]); 
                    break;
                case "parents":
                    people.get(input[0]).addParent(input[2], input[3]); 
                    break;
                case "children":
                    people.get(input[0]).addChild(input[2], input[3]); 
                    break;
                case "car":
                    people.get(input[0]).addCar(input[2], input[3]); 
                    break;
            
            }

        }

        String name=scanner.nextLine();
        System.out.println(name+"\n"+people.get(name));
        
    }
}
