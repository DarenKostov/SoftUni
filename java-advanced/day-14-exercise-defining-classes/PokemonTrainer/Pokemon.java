class Pokemon{

    private String name;
    private String element;
    private int health;

    
    public Pokemon(String name, String element, int health) {
        this.name=name;
        this.element=element;
        this.health=health;
    }

    public boolean isElement(String element){
        return this.element.equals(element);
    }


    //returns whether the pokemon survived or not
    public boolean removeHealth(){
        health-=10;
        return health>0;
    }



}
