class Tires{

    private boolean goodPressure;
    
    public Tires(double pressure1, double pressure2, double pressure3, double pressure4){
        this.goodPressure=
        pressure1>=1 && 
        pressure2>=1 &&
        pressure3>=1 &&
        pressure4>=1;
    }

    public boolean isGoodPressure(){
        return this.goodPressure;
    }

}
