import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        TreeSet<Individual> namesList=new TreeSet<>(new NameComparator());
        TreeSet<Individual> ageList=new TreeSet<>(new AgeComparator());
        
        
        int num=Integer.parseInt(scanner.nextLine());

        for(int i=0; i<num; i++){
            String[] input=scanner.nextLine().split(" ");
        
            Individual newIndividual=new Individual(input[0], Integer.parseInt(input[1]));
            namesList.add(newIndividual);
            ageList.add(newIndividual);
        }


        namesList.forEach(System.out::println);
        ageList.forEach(System.out::println);
    

        
    }
}
