import java.util.*;

class VehicleCatalogue{

    static class Vehicle{
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower){
            this.type=type;
            this.model=model;
            this.color=color;
            this.horsePower=horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public void print(){
            System.out.printf("Type: %s\n", this.type);
            System.out.printf("Model: %s\n", this.model);
            System.out.printf("Color: %s\n", this.color);
            System.out.printf("Horsepower: %d\n", this.horsePower);
        }
        
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> catalogue = new ArrayList<>();

        for(String[] command=scanner.nextLine().split(" "); !command[0].equals("End"); command=scanner.nextLine().split(" ")){
            catalogue.add(new Vehicle(command[0].substring(0,1).toUpperCase()+command[0].substring(1), command[1], command[2], Integer.parseInt(command[3])));
        }
        
        for(String command=scanner.nextLine(); !command.equals("Close the Catalogue"); command=scanner.nextLine())
            for (Vehicle vehicle : catalogue)
                if (vehicle.getModel().equals(command))
                    vehicle.print();

        int carsAmount=0;
        int trucksAmount=0;
        Double carsHorsePowerSum=0.0;
        Double trucksHorsePowerSum=0.0;
        
        
        for (Vehicle vehicle : catalogue){
            if(vehicle.getType().equals("Car")){
                carsAmount++;
                carsHorsePowerSum+=vehicle.getHorsePower();
                // System.out.println("CAR!!!!!");
            }else{
                trucksAmount++;
                trucksHorsePowerSum+=vehicle.getHorsePower();
                // System.out.println("TRUCK!!!!!");
            }
        
        }
        carsAmount=Math.max(1, carsAmount);
        trucksAmount=Math.max(1, trucksAmount);
        System.out.printf("Cars have average horsepower of: %.2f.\n", carsHorsePowerSum/carsAmount);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksHorsePowerSum/trucksAmount);
        
    }
}
