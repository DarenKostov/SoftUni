package automotiveRepairShop;
import java.util.*;

public class RepairShop{

    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int in){
        this.capacity=in;
        vehicles=new ArrayList<>();
    }
    public RepairShop(){
        this.capacity=0;
        vehicles=new ArrayList<>();
    }
    public void setCapacity(int capacity){
    	this.capacity=capacity;
    }
    
    public int getCapacity(){
    	return this.capacity;
    }
    
    public void addVehicle(Vehicle vehicle){
        if(vehicles.size()==capacity){
            return;
        }
        vehicles.add(vehicle);
        return;
    }

    public boolean removeVehicle(String vin){
        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i).getVIN().equals(vin)){
                vehicles.remove(i);
                return true;
            }
        }
        return false;
    }


    public int getCount(){
        return vehicles.size();
    }  

    public Vehicle getLowestMileage(){
        Vehicle out=null;
        int lowestMiles=Integer.MAX_VALUE; 
            
        for(Vehicle vehicle : vehicles){
            if(vehicle.getMileage()<lowestMiles){
                lowestMiles=vehicle.getMileage();
                out=vehicle;
            }
        }
        return out;
    }

    public String report(){
        String out="Vehicles in the preparatory:\n";

        for(Vehicle vehicle : vehicles){
            out+=vehicle;
            out+="\n";
        }
        return out;
    }

    
}
