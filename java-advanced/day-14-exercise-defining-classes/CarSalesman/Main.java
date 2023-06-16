import java.util.*;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Car> cars=new ArrayList<>();
        Map<String, Engine> engines=new HashMap<>();


        
        int N=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<N; i++){
            String[] input=scanner.nextLine().split(" ");

            if(input.length==4){
                engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]), input[3]));
                continue;
            }
            if(input.length==2){
                engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1])));
                continue;
            }

            int displacement=-1;

            try{
                displacement=Integer.parseInt(input[2]);
            }catch(NumberFormatException ex){
                engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1]),  input[2]));
                continue;
            }
            engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1]), displacement));

        }

        N=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<N; i++){
            

            String[] input=scanner.nextLine().split(" ");

            if(input.length==4){
                cars.add(new Car(input[0], engines.get(input[1]), Integer.parseInt(input[2]), input[3]));
                continue;
            }
            if(input.length==2){
                cars.add(new Car(input[0], engines.get(input[1])));
                continue;
            }

            int weight=-1;

            try{
                weight=Integer.parseInt(input[2]);
            }catch(NumberFormatException ex){
                cars.add(new Car(input[0], engines.get(input[1]), input[2]));
                continue;
            }
                cars.add(new Car(input[0], engines.get(input[1]), weight));

        }

       cars.stream().forEach(System.out::println); 
        
    }
}
