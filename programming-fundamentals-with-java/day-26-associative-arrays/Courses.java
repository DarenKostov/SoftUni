import java.util.*;

class Courses{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, List<String>> courses=new LinkedHashMap<>();

        for(String[] input=scanner.nextLine().split(" : "); !input[0].equals("end"); input=scanner.nextLine().split(" : ")){
            // System.out.println(input[0]+" q "+input[1]);
            if(!courses.containsKey(input[0]))
                courses.put(input[0], new ArrayList<String>());
            courses.get(input[0]).add(input[1]);
        }

        for(Map.Entry<String, List<String>> course : courses.entrySet()){
            System.out.printf("%s: %d\n", course.getKey(), course.getValue().size());
            for(String student : course.getValue()){
                System.out.printf("-- %s\n", student);
            }

        }
    }
}
