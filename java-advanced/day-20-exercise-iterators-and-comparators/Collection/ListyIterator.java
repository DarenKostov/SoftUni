import java.util.*;
import java.util.function.*;

class ListyIterator implements Iterable<String>{

    private List<String> list;
    private int index;
    
    ListyIterator(String... input){
        this.list=List.of(input);
        this.index=0;
    }

    public boolean move(){
        if(hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    public void print(){
        if(this.list.isEmpty()){
            throw new IllegalStateException("Invalid Operation!");
        }
    
        System.out.println(this.list.get(index));
    }


    public boolean hasNext(){
        return list.size()>(this.index+1);
    }


    @Override
    public void forEach(Consumer<? super String> action){
        // Iterable.super.forEach(action);
        this.list.forEach(action);
    }

    
    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();

    }

    public class CustomIterator implements Iterator<String>{

        int index=0;

        @Override
        public boolean hasNext(){
            return this.index<list.size();
        }

        @Override
        public String next(){
            return list.get(index++);
        }
            
    };

    
    
}
