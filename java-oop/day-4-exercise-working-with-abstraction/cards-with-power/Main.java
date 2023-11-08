import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        
        Rank rank=Rank.valueOf(scanner.nextLine());
        Suit suit=Suit.valueOf(scanner.nextLine());
    
        System.out.printf("Card name: %s of %s; Card power: %d\n", rank.name(), suit.name(), rank.getPower() + suit.getPower());

    
    
    }
}
