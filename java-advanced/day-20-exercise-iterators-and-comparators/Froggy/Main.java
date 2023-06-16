import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Lake lake;

        
        Integer[] nums=Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        lake=new Lake(nums);
        scanner.nextLine();

        Iterator<Integer> iterator =lake.iterator();        

        while(iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();

        
        
    }
}
