import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        
        List<Box> boxes=new ArrayList<>();
        
        
        int num=Integer.parseInt(scanner.nextLine());
        
        for(int i=0; i<num; i++){
            boxes.add(new Box<String>(scanner.nextLine()));
        }

        String[] command=scanner.nextLine().split(" ");


        swap(boxes, Integer.parseInt(command[0]), Integer.parseInt(command[1]));

        for(Box box : boxes){
            System.out.println(box);
        
        }

        
    }

    private static <T> void swap(List<T> elements, int index1, int index2){
        T tmp=elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, tmp);
    
    }

    
}
