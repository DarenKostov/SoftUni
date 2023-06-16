import java.util.*;
import java.util.function.*;

class Lake implements Iterable<Integer>{
    
    private Integer[] items;


    public Lake(Integer... in){
        items=in;
    
    }

    
    @Override
    public Iterator<Integer> iterator(){
        return new Frog();
    }

   @Override
    public void forEach(Consumer<? super Integer> action){
        Iterable.super.forEach(action);
    }

    private class Frog implements Iterator<Integer>{

        private int index=0;
        private boolean evens=true;

        @Override
        public boolean hasNext(){
            return index<items.length;
        }

        
         @Override
        public Integer next(){

            Integer out=items[index];

            index+=2;
            
            if(index>=items.length && evens){
                index=1;
                evens=false;
            }
            
            return out;
        
        }
        
    
    };

    
}
