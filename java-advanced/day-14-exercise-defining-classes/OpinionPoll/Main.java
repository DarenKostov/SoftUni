import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        List<Person> people=new ArrayList<>();

        for(int i=0; i<num; i++){
            String[] command=scanner.nextLine().split(" ");
            people.add(new Person(command[0], Integer.parseInt(command[1])));
        }

        people.stream().filter(p->p.getAge()>30).sorted((p1, p2)->p1.getName().compareTo(p2.getName())).forEach(System.out::println);


    }
}
