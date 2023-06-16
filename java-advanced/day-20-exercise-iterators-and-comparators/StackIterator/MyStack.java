import java.util.*;
import java.util.function.*;

class MyStack implements Iterable<Integer>{

    private Integer[] elements;
    private int index;

    
    public MyStack(){
        this.elements=new Integer[16];
        this.index=0;
    }


    public void push(Integer in){
        this.elements[this.index]=in;
        this.index++;
    }


    public int pop(){
        try{
            Integer tmp=this.elements[this.index-1];
            this.elements[this.index-1]=null;
            this.index--;
            return tmp;
        }catch(ArrayIndexOutOfBoundsException ex){
            throw new IllegalStateException("No elements");
            
        
        }
    }

    @Override
    public void forEach(Consumer<? super Integer> action){
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<Integer> iterator(){
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer>{

        private int index=MyStack.this.index;
    
        @Override
        public boolean hasNext(){
            return index>0;
        }
        
        @Override
        public Integer next(){
            if(hasNext()){
                index--;
                return elements[index];
            }
            throw new NoSuchElementException();
        }  
    }

        
}
