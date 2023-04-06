import java.util.*;

class Students{

    static class Student {

        private String firstName;
        private String lastName;
        private double grade;
        public Student(String firstName, String lastName, Double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }

        @Override
        public String toString(){
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }

        public double getGrade(){
            return this.grade;
        }
        
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        List<Student> studentList = new ArrayList<Student>();
        
        
        int num=Integer.parseInt(scanner.nextLine());

        for(int i=0; i<num; i++){
            String[] info=scanner.nextLine().split(" ");   
            studentList.add(new Student(info[0], info[1], Double.parseDouble(info[2])));
        
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList)
            System.out.println(student);
    }
}
