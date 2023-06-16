class Engine{

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency){
        this.model=model;
        this.power=power;
        this.displacement=displacement;
        this.efficiency=efficiency;
    }
    public Engine(String model, int power, int displacement){
        this.model=model;
        this.power=power;
        this.displacement=displacement;
        this.efficiency="n/a";
    }
    public Engine(String model, int power, String efficiency){
        this.model=model;
        this.power=power;
        this.displacement=-1;
        this.efficiency=efficiency;
    }
    public Engine(String model, int power){
        this.model=model;
        this.power=power;
        this.displacement=-1;
        this.efficiency="n/a";
    }

    @Override
    public String toString(){
        String output=this.model+":\n";
        output+="Power: "+this.power+"\n";
        output+="Displacement: "+(this.displacement==-1? "n/a" : this.displacement)+"\n";
        output+="Efficiency: "+this.efficiency;

        return output;
    }


    
}
