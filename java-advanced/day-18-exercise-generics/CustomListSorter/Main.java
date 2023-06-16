import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyList<String> aList=new MyList<>();
            
        while(true){
            String[] input=scanner.nextLine().split(" ");
            if(input[0].equals("END")){
                break;
            }       

            switch(input[0]){
                case "Add":
                    aList.add(input[1]);
                    break;
                case "Remove":
                    aList.remove(Integer.parseInt(input[1]));
                    break;
                case "Contains":
                    System.out.println(aList.contains(input[1])? "true" : "false");
                    break;
                case "Swap":
                    aList.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Greater":
                    System.out.println(aList.greaterThan(input[1]));
                    break;
                case "Max":
                    System.out.println(aList.getMax());
                    break;
                case "Min":
                    System.out.println(aList.getMin());
                    break;
                case "Print":
                    aList.forEach(System.out::println);
                    break;
                case "Sort":
                    Sorter.sort(aList);
                    break;
            }


            
        }

    scanner.close();
        
    }
}
