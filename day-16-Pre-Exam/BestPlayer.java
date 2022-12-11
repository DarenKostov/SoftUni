import java.util.Scanner;
class BestPlayer{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        
        String bestName="";
        int bestScore=0;
        
        while(!name.equals("END")){
            int score= Integer.parseInt(scanner.nextLine());
            
            if(score>bestScore){
                bestScore=score;
                bestName=name;
            }
            
            if(score>=10)
                break;
                
        name=scanner.nextLine();
        }
        
        System.out.println(bestName+" is the best player!");
        System.out.printf("He has scored %d goals", bestScore);
        if(bestScore>=3)
            System.out.print(" and made a hat-trick !!!\n");
        else
            System.out.print(".\n");
        
        
        
    }
}
