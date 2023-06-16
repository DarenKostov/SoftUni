import java.util.*;

class Individual{

    String name;
    int age;



    public Individual(String name, int age){
        this.name=name;
        this.age=age;
    }


    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return name+" "+age;
    }
    
}
