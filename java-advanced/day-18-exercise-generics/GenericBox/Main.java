import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        for(int i=0; i<num; i++){
            Box<String> box=new Box<>(scanner.nextLine());
            System.out.println(box); 
        }       
    }
}
