import java.util.Scanner;
class Building{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int floors=Integer.parseInt(scanner.nextLine());
        int rooms=Integer.parseInt(scanner.nextLine());
        
        for(int f=floors; f>0; f--){
            char type='A';
            if(f%2==0)
                type='O';
            if(f==floors)
                type='L';
            
            for(int r=0; r<rooms; r++){
                System.out.printf("%c%d%d ", type, f, r);
            }
            System.out.println("");
        }

    }
}
