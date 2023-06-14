import java.util.*;

class HandsOfCards{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Set<String>> players=new LinkedHashMap<>();

            while(true){
                String input=scanner.nextLine();
                if(input.equals("JOKER")){
                    break;
                }

                String[] parameters=input.split(": ");
                String name=parameters[0];

                players.putIfAbsent(name, new TreeSet<>());

                for(String card : parameters[1].split(", ")){
                    players.get(name).add(card);
                }
            }


            for(Map.Entry<String, Set<String>> cards: players.entrySet()){

                int sum=0;
            
                for(String card : cards.getValue()){
                    int suit=0;
                    int value=0;
                    
                    switch(card.charAt(card.length()-1)){
                        case 'S':
                            suit=4;
                            break;
                        case 'H':
                            suit=3;
                            break;
                        case 'D':
                            suit=2;
                            break;
                        case 'C':
                            suit=1;
                            break;
                    }
                    card=card.substring(0, card.length()-1);
                                        
                    switch(card){
                        case "J":
                            value=11;
                            break;
                        case "Q":
                            value=12;
                            break;
                        case "K":
                            value=13;
                            break;
                        case "A":
                            value=14;
                            break;
                        default:
                            value=Integer.parseInt(card);
                            break;
                    }

                    sum+=value*suit;

                    
                }

                System.out.printf("%s: %d\n", cards.getKey(), sum);
                            
            
            }

    }
}
