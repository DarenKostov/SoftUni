import java.util.Scanner;
class VowelsSum{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);

    String in=scanner.nextLine();
    
    int sum=0;
    
    for(int i=0; i<in.length(); i++)
        switch(in.charAt(i)){
        case 'a':
            sum++;
            break;
        case 'e':
            sum+=2;
            break;
        case 'i':
            sum+=3;
            break;
        case 'o':
            sum+=4;
            break;
        case 'u':
            sum+=5;
        }
    System.out.println(sum);
    
    }
}
