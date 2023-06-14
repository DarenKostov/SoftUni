import java.util.*;

class PeriodicTable{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        
        Set<String> strings=new TreeSet<String>();

        for(int i=0; i<num; i++){
            for(String in : scanner.nextLine().split(" ")){
                strings.add(in);            
            }
        }

        for(String out : strings){
            System.out.print(out+" ");
        }
            System.out.println();

        
    }
}
