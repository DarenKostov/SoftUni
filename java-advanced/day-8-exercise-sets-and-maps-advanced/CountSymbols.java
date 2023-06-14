import java.util.*;

class CountSymbols{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Map<Character, Integer> chars=new TreeMap<>();
        
        
        for(char in : scanner.nextLine().toCharArray()){
            chars.putIfAbsent(in, 0);
            chars.put(in, chars.get(in)+1);
        }
        
        for(Map.Entry<Character, Integer> out : chars.entrySet()) {
            System.out.printf("%c: %d time/s\n", out.getKey(), out.getValue());
        }


        
    }
}
