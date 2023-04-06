import java.util.Scanner;

class OpinionPoll{

    static class Person{

        private String name;
        private int age;

        public Person(String name, int age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        Person[] people=new Person[num];

        for(int i=0; i<num; i++){
            String[] command=scanner.nextLine().split(" ");
            people[i]=new Person(command[0], Integer.parseInt(command[1]));
        }
        
        for(Person person : people){
            if(person.getAge()>30)
                System.out.printf("%s - %d\n", person.getName(), person.getAge());
        
        }

        
    }
}
