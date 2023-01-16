import java.util.Scanner;
class TrainTheTrainers{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numberOfTeachers=Integer.parseInt(scanner.nextLine());
        String action=scanner.nextLine();
        
        int numberOfGrades=0;
        double finalAssessment=0;
        
        
        while(!action.equals("Finish")){
            double grade=0;
            for(int i=0; i<numberOfTeachers; i++){
            //add grade from teachers
                grade+=Double.parseDouble(scanner.nextLine());          
            }
            //get average
            grade/=numberOfTeachers;
                        
            //print out the grade
            System.out.printf("%s - %.2f.\n", action, grade);
            
                        
            //add grade from subject
            finalAssessment+=grade;
        
            numberOfGrades++;
        
        
        
        //get new subject
        action=scanner.nextLine();
        }
        //get the average
        finalAssessment/=numberOfGrades;

        System.out.printf("Student's final assessment is %.2f.\n",finalAssessment);
                        
                
    }
}
