import java.util.Scanner;
class CinemaTickets{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String movie=scanner.nextLine();
        
        int student=0;
        int standard=0;
        int kid=0;
        int total=0;
        
        while(!movie.equals("Finish")){
            int seats=Integer.parseInt(scanner.nextLine());
            int totalPerMovie=0;
            String ticketType=scanner.nextLine();
            
            while(!ticketType.equals("End")){
                total++;
                totalPerMovie++;
                switch(ticketType){
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }    
                if(totalPerMovie==seats)
                    break;
                
                ticketType=scanner.nextLine();
                
            }
            System.out.printf("%s - %.2f%% full.\n", movie, 100.0*totalPerMovie/seats);
            movie=scanner.nextLine();
        }
        
        System.out.printf("Total tickets: %d\n", total);
        System.out.printf("%.2f%% student tickets.\n", 100.0*student/total);
        System.out.printf("%.2f%% standard tickets.\n", 100.0*standard/total);
        System.out.printf("%.2f%% kids tickets.\n", 100.0*kid/total);
        
    }
}
