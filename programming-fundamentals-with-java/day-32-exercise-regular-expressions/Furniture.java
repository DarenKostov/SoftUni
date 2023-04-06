import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Furniture{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> furniture=new ArrayList<String>();
        double sum=0.0;

        
        String regex=">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<amount>[0-9]+)";
        Pattern pattern=Pattern.compile(regex);

        for(String command=scanner.nextLine(); !command.equals("Purchase"); command=scanner.nextLine()){

            Matcher matcher=pattern.matcher(command);
            
            if(matcher.find()){
                furniture.add(matcher.group("name"));
                sum+=Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("amount"));
                // System.out.println(sum);
            }
        
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f\n", sum);
    
    }
}
