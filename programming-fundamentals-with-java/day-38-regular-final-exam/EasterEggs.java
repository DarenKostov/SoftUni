import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EasterEggs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // color:   [#@](?<color>[a-z]{3,})[#@]
        // amount:  [\/](?<amount>[0-9]+)[\/]
        String regex="[#@](?<color>[a-z]{3,})[#@][^a-zA-Z0-9]*[\\/](?<amount>[0-9]+)[\\/]";
        Pattern pattern=Pattern.compile(regex);

        
        String str=scanner.nextLine();
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            
            String color=matcher.group("color");
            int amount=Integer.parseInt(matcher.group("amount"));
            System.out.printf("You found %d %s eggs!\n", amount, color);
       }

        
    }
}
