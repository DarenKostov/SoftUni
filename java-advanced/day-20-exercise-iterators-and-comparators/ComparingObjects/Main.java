import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        List<Human> people=new ArrayList<>();

        while(true){
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("END")){
                break;
            }

            people.add(new Human(input[0], Integer.parseInt(input[1]), input[2]));

        }

        int num=Integer.parseInt(scanner.nextLine())-1;

        Human theChosenOne=people.get(num);

        int cloneCount=0;

        
        for(Human person : people){
            if(person.compareTo(theChosenOne)==0){
                cloneCount++;
            }
        }

        if(cloneCount==1){
            System.out.println("No matches");
        
        }else{
            System.out.printf("%d %d %d\n", cloneCount, people.size()-cloneCount, people.size());
        }
        
        
    }
}
