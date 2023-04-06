import java.util.*;

class StudentAcademy{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N=Integer.parseInt(scanner.nextLine());
        
        LinkedHashMap<String, Integer> gradesAmount = new LinkedHashMap<>();
        LinkedHashMap<String, Double> gradesSum = new LinkedHashMap<>();

        for(int i=0; i<N; i++){
            String student=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());
            
            gradesAmount.putIfAbsent(student, 0);
            gradesSum.putIfAbsent(student, 0.0);
            gradesAmount.put(student, gradesAmount.get(student)+1);
            gradesSum.put(student, gradesSum.get(student)+grade);

        }
        for(Map.Entry<String, Double> entry : gradesSum.entrySet()){
            double average=entry.getValue()/gradesAmount.get(entry.getKey());
            if(average>=4.5)
                System.out.printf("%s -> %.2f\n", entry.getKey(), average);
        }
    }
}
