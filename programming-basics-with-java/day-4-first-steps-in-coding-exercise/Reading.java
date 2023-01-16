import java.util.Scanner;
class Reading{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        //total pages in the book
        int totalPages=Integer.parseInt(scanner.nextLine());
        //pages per hour
        int readingSpeed= Integer.parseInt(scanner.nextLine());
        //time limit in days
        int timeLimit= Integer.parseInt(scanner.nextLine());
        
        int timeToReadPerDay= totalPages/readingSpeed/timeLimit;
        
        System.out.println(timeToReadPerDay);
        
    }
}
