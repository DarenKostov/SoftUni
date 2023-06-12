import java.util.*;

class MaximumElement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int commandCount=Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numStack= new ArrayDeque<>();
        

        for(int i=0; i<commandCount; i++){
            String[] command=scanner.nextLine().split(" ");

            switch(command[0]){
                case "1":
                    numStack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    numStack.pop();
                    break;
                case "3":
                    int biggest=-99999999;
                    for(int num : numStack){
                        biggest=Math.max(num, biggest);
                    }
                    System.out.println(biggest);
                    break;
                
            
            }

            
        }

        
    }
}
