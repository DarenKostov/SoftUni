import java.util.Scanner;

class AddAndSubtract{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(add(num1, num2), num3));
        
    }

    static int add(int n1, int n2){
        return n1+n2;
    }
    static int subtract(int n1, int n2){
        return n1-n2;
    }
}
