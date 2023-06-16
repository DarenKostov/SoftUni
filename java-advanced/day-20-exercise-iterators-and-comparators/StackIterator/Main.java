import java.util.Iterator;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyStack aStack=new MyStack();


        while(true){
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("END")){
                break;
            }

            switch(input[0]){
                case "Push":
                    for(int i=1; i<input.length; i++){
                        aStack.push(Integer.parseInt(input[i].replace(",", "")));
                    }
                    break;
                case "Pop":
                    try{
                        aStack.pop();
                    }catch(IllegalStateException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
            }
        }


            aStack.forEach(System.out::println);
            aStack.forEach(System.out::println);
            

    }
}
