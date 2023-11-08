public class TrafficLight{

    private TrafficColor color;


    
    public TrafficLight(TrafficColor color){
        this.color=color;
    }

    public TrafficColor getColor(){
        return color;
    }



    public void updateColor(){
        switch(color){
            case GREEN:
                color=TrafficColor.YELLOW;
                break;
            case YELLOW:
                color=TrafficColor.RED;
                break;
            case RED:
                color=TrafficColor.GREEN;
                break;
            
        }
    
    
    }


}
