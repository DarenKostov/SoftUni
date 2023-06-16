class Box<T>{

    private T value;


    public Box(T in){
        this.value=in;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.value.getClass().getName(), this.value);
    }    

}


