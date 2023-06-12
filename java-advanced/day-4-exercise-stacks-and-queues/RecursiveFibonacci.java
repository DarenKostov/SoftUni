import java.util.*;

class RecursiveFibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> sequence= new ArrayDeque<>();

        sequence.push(0l);
        sequence.push(1l);


        for(int i=0; i<num; i++){
            long first=sequence.pop();
            long second=sequence.peek();
            sequence.push(first);
            sequence.push(first+second);
        }
        System.out.println(sequence.peek());

    }
}
