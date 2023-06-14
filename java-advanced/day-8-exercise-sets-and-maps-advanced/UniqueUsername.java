import java.util.*;

class UniqueUsername{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        Set<String> strings=new LinkedHashSet<String>();
    
        for(int i=0; i<num; i++){
            strings.add(scanner.nextLine());
        }


        System.out.println((strings+"").replace(", ", "\n").replace("[", "").replace("]", ""));
    }
}
