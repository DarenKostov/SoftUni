import java.util.Scanner;

class SmallestOfThreeNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        printSmallest(num1, num2, num3);
    }

    public static void printSmallest(int n1, int n2, int n3){

        int smallest=Math.min(n1, Math.min(n2, n3));
        System.out.println(smallest);
    
    }
}
