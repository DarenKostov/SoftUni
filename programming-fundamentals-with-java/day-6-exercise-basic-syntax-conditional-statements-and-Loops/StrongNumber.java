import java.util.Scanner;

class StrongNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num=scanner.nextLine();
        int strongSum=0;
        
        for(int i=0; i<num.length(); i++){
            int currentNum=Integer.parseInt(num.charAt(i)+"");
            
            //calc factorial
            int factorial=1;
            for(int j=1; j<=currentNum; j++)
                factorial*=j;

            strongSum+=factorial;
        }

        if(strongSum==Integer.parseInt(num))
            System.out.println("yes");
        else
            System.out.println("no");
        
    }
}
