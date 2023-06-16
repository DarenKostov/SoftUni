import java.util.*;


class ListyIterator{

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
    
    
}
