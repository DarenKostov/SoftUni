import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers=new LinkedHashMap<>();

        

        
        while(true){
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("Tournament")){
                break;
            }
            
            trainers.putIfAbsent(input[0], new Trainer(input[0]));
            trainers.get(input[0]).addPokemon(input[1], input[2], Integer.parseInt(input[3]));
        }

        while(true){
            String input=scanner.nextLine();
            if(input.equals("End")){
                break;
            }

            for(Trainer trainer : trainers.values()){
                trainer.battle(input);
            }
        }

        trainers.values().stream().sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges())).forEach(System.out::println);

        

    }
}
