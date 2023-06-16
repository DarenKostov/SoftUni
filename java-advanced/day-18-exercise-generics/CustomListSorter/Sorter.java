import java.util.*;

class Sorter{
    static public <T extends Comparable<T>> void sort(MyList<T> array){
        for(int i=0; i<array.size(); i++){
            T current=array.get(i);
            for(int j=i+1; j<array.size(); j++){
                if(current.compareTo(array.get(j))>0){
                    array.swap(i, j);
                }
            }
        }
    }
}