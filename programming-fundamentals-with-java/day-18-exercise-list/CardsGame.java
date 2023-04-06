import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class CardsGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while(player1.size()!=0 && player2.size()!=0){
            int player1Card=player1.get(0);
            int player2Card=player2.get(0);

            player1.remove(0);
            player2.remove(0);
        
            if (player1Card<player2Card){
                player2.add(player2Card);
                player2.add(player1Card);
            }else if(player1Card>player2Card){
                player1.add(player1Card);
                player1.add(player2Card);
            }
        }
        int sum=0;
        if(player1.size()==0){
            for (Integer card : player2)
                sum+=card;
            System.out.printf("Second player wins! Sum: %d\n", sum);
        }else{
            for (Integer card : player1)
                sum+=card;
            System.out.printf("First player wins! Sum: %d\n", sum);
        }
    
    }
}
