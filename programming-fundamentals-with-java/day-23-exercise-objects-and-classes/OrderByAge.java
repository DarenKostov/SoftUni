import java.util.*;

class OrderByAge{


    static class Person{

        private String name;
        private String id;
        private int age;


        public Person(String name, String id, int age){
            this.name=name;
            this.id=id;
            this.age=age;
        }

        public int getAge() {
            return this.age;
        }

        public void print(){
            System.out.printf("%s with ID: %s is %d years old.\n", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        for(String[] command=scanner.nextLine().split(" "); !command[0].equals("End"); command=scanner.nextLine().split(" "))
            people.add(new Person(command[0], command[1], Integer.parseInt(command[2])));

        people.sort(Comparator.comparing(Person::getAge));
        
         for (Person person : people)
            person.print();

    }
}
