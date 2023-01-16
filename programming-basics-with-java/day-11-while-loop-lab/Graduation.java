import java.util.Scanner;
class Graduation{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        double gradeAvg=0;
        int schoolYear=1;
        
        while(schoolYear!=13){
            double grade=Double.parseDouble(scanner.nextLine());
            
            if(grade<4)
                break;
                                                                                        
            gradeAvg+=grade/12;
            schoolYear++;
        }
        
        if(schoolYear==13)
            System.out.printf("%s graduated. Average grade: %.2f\n", name, gradeAvg);
        else
            System.out.printf("%s has been excluded at %d grade\n", name, schoolYear);
    }
}
