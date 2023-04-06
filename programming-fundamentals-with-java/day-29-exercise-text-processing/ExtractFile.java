import java.util.Scanner;

class ExtractFile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] path=scanner.nextLine().split("\\\\");

        
        
        String name=path[path.length-1].split("\\.")[0];
        String extention=path[path.length-1].split("\\.")[1];

        System.out.println("File name: "+name);
        System.out.println("File extension: "+extention);
        
    }
}
