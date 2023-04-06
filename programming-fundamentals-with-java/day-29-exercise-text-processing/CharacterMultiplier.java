import java.util.Scanner;

class CharacterMultiplier{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] str=scanner.nextLine().split(" ");
        System.out.println(multiplyAndAddEachChar(str[0], str[1]));
    }

    static int multiplyAndAddEachChar(String str1, String str2){
        int sum=0;
        for(int i=0; i<Math.max(str1.length(), str2.length()); i++){
            char c1;
            char c2;

            if(i>=str1.length())
                c1=1;
            else
                c1=str1.charAt(i);
            
            if(i>=str2.length())
                c2=1;
            else
                c2=str2.charAt(i);
            
            sum+=c1*c2;
            
        
        }
        return sum;
    
    }

    
}
