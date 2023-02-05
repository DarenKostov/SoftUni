import java.util.Scanner;

class BeerKegs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        String biggestKegName="";
        double biggestKegVolume=0;
        
        for(int i=0; i<N; i++){
            String modelName=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());

            double volume= Math.PI*Math.pow(radius,2)*height;

            if(volume>biggestKegVolume){
                biggestKegName=modelName;
                biggestKegVolume=volume;
            }
        }

        System.out.println(biggestKegName);
                
    }
}
