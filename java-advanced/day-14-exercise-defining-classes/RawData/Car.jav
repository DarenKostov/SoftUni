class Car{

    Tires tires;
    Engine engine;
    Cargo cargo;
    String name;

    public Car(String name, int power, String cargoType, double pressure1, double pressure2, double pressure3, double pressure4){
        this.tires=new Tires(pressure1, pressure2, pressure3, pressure4);
        this.engine=new Engine(power);
        this.cargo=new Cargo(cargoType);
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isFragile(){
        if(!cargo.getType().equals("fragile")){
            return false;
        }
        return !tires.isGoodPressure();
    }
    
    public boolean isFlamable(){
        if(!cargo.getType().equals("flamable")){
            return false;
        }
        return engine.getPower()>250;
    }
    

}
