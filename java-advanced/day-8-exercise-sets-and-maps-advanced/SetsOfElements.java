import java.util.*;

class SetsOfElements{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] input=scanner.nextLine().split(" ");
        int N=Integer.parseInt(input[0]);
        int M=Integer.parseInt(input[1]);


        Set<Integer> intsN=new LinkedHashSet<>();
        Set<Integer> intsM=new LinkedHashSet<>();
        

        for(int i=0; i<N; i++){
            intsN.add(Integer.parseInt(scanner.nextLine()));
        }
        for(int i=0; i<M; i++){
            intsM.add(Integer.parseInt(scanner.nextLine()));
        }


        for(int num : intsN){
            if(intsM.contains(num)){
                System.out.print(num+ " ");
            }
        }
        
        System.out.println();

    }
}
