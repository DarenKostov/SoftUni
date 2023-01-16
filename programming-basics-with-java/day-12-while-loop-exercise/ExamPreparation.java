import java.util.Scanner;
class ExamPreparation{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int badGradesLimit=Integer.parseInt(scanner.nextLine());
        int badGrades=0;
        String problem=scanner.nextLine();
        String lastProblem="";
        int grade=Integer.parseInt(scanner.nextLine());
        boolean breakTime=false;
        int problemsDone=0;
        int problemsSum=0;
        
        while(true){
            if(grade<=4)
                badGrades++;
        
            if(badGrades==badGradesLimit){
                breakTime=true;
                break;
            }    
            problemsDone++;
            problemsSum+=grade;
                    
            problem=scanner.nextLine();
            
            if(problem.equals("Enough"))
                break;
            lastProblem=problem;
            grade=Integer.parseInt(scanner.nextLine());
        }
        if(breakTime){
            System.out.println("You need a break, "+badGradesLimit+" poor grades.");
        }else{
            System.out.printf("Average score: %.2f\n", problemsSum*1.0/problemsDone);
            System.out.printf("Number of problems: %d\n", problemsDone);
            System.out.printf("Last problem: %s\n", lastProblem);
        
        }
        
        
    }
}
