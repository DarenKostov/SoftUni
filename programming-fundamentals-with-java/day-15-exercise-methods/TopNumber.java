import java.util.Scanner;

class TopNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        for(int i=1; i<=num; i++){
            if(isTopNumber(i))
                System.out.println(i);
        
        }

    }

    static boolean isTopNumber(int num){
        String numString=num+"";
        int sum=0;
        boolean odd=false;        

        for(int i=0; i<numString.length(); i++){
            int digit=Integer.parseInt(""+numString.charAt(i));
            sum+=digit;
            if(digit%2==1)
                odd=true;
        }

        if(sum%8==0)
            return odd;
        return false;
        
    }

    
}
