import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        List<Box<Double>> boxes=new ArrayList<>();
        
        
        int num=Integer.parseInt(scanner.nextLine());
        
        for(int i=0; i<num; i++){
            boxes.add(new Box<>(Double.parseDouble(scanner.nextLine())));
        }

        Box<Double> someBox=new Box<>(Double.parseDouble(scanner.nextLine()));
        System.out.println(countGreaterElements(boxes, someBox));


        
    }

    private static <T extends Comparable<T>> int countGreaterElements(List<T> elements, T input){
        int sum=0;

        for(T element : elements){
            if(element.compareTo(input)>0){
                sum++;
            }
        }
        
        return sum;
    }

    private static <T> void swap(List<T> elements, int index1, int index2){
        T tmp=elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, tmp);
    
    }

    
}
