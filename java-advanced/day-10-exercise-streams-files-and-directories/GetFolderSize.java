import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.Paths;

class GetFolderSize{
    public static void main(String[] args) throws IOException {

        String inPath="./resources/Exercises Resources";


        File dir= new File(inPath);

        File[] files=dir.listFiles();

        long sum=0;

        for(File file : files){
            sum+=file.length();
        }

        
        System.out.println("Folder size: "+sum);
            
        
    }
}
