import java.util.Scanner;

class TheBiscuitFactory{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cookiesPerDayPerWorker=Integer.parseInt(scanner.nextLine());
        int AmountOfWoerkers=Integer.parseInt(scanner.nextLine());
        long competatorTotalCookies=Integer.parseInt(scanner.nextLine());
        
        long ourTotalCookies=0; 

    
        for(int i=1; i<31; i++){
            double cookiesForToday=AmountOfWoerkers*cookiesPerDayPerWorker;
            if(i%3==0)
                cookiesForToday*=0.75;

            ourTotalCookies+=Math.floor(cookiesForToday);
        }
    
        System.out.printf("You have produced %d biscuits for the past month.\n", ourTotalCookies);
        if(ourTotalCookies<competatorTotalCookies)
            System.out.printf("You produce %.2f percent less biscuits.\n", 100-100.0*ourTotalCookies/competatorTotalCookies);
        else
            System.out.printf("You produce %.2f percent more biscuits.\n", (100.0*ourTotalCookies/competatorTotalCookies)-100);
        

    
    }
}
