import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        List<Car> cars=new ArrayList<>();

        for(int i=0; i<num; i++){
            String[] input=scanner.nextLine().split(" ");
            cars.add(new Car(input[0], Integer.parseInt(input[2]), input[4], Double.parseDouble(input[5]), Double.parseDouble(input[7]), Double.parseDouble(input[9]), Double.parseDouble(input[11])));
        }



        if(scanner.nextLine().equals("fragile")){
            for(Car car : cars){
                if(car.isFragile()){
                    System.out.println(car.getName());
                }
            
            }
        }else{
            for(Car car : cars){
                if(car.isFlamable()){
                    System.out.println(car.getName());
                }
        
            }
        }

        
    }
}
