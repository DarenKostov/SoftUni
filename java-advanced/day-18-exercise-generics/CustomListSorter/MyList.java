import java.util.*;
// import java.util.Collections;

class MyList<T extends Comparable<T>> extends ArrayList<T>{



    public MyList(){
        super();
    }


    public void swap(int i1, int i2){
        T tmp=this.get(i1);
        this.set(i1, this.get(i2));
        this.set(i2, tmp);
    }

    public int greaterThan(T in){
        int out=0;

        for(T element : this){
            if(element.compareTo(in)>0){
                out++;
            }
        }
        return out;                
    }

    public T getMax(){
        return Collections.max(this);
    }
    public T getMin(){
        return Collections.min(this);
    }


}
