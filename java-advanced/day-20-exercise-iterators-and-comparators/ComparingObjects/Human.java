import java.util.*;

class Human implements Comparable<Human>{

    String name;
    int age;
    String town;

    public Human(String name, int age, String town){
        this.name=name;
        this.age=age;
        this.town=town;
    }


    

    
    @Override
    public int compareTo(Human in){
        if(this.name.equals(in.name)){
            if(this.age==in.age){
                if(this.town.equals(in.town)){
                    return 0;
                }
            }
        }
        return 1;
    }


    
}
