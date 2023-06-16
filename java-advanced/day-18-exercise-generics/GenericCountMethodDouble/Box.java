class Box<T extends Comparable<T>> implements Comparable<Box<T>>{

    private T value;


    public Box(T in){
        this.value=in;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.value.getClass().getName(), this.value);
    }    

    @Override
    public int compareTo(Box<T> in){
        return this.value.compareTo(in.value);
    }


}


