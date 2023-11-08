import java.util.*;
import java.util.stream.Collectors;

class TempleOfDoom{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        List<Integer> tools=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> substances=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> challenges=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        boolean won=false;

        
        while(true){
            if(challenges.size()==0){
                won=true;
                // System.out.println("aaa");
                break;
            }

            if(substances.size()==0 || tools.size()==0){
                // System.out.println(substances.size()+", "+tools.size());
                break;
            }

            Integer tool=tools.get(0);
            tools.remove(0);

            Integer substance=substances.get(substances.size()-1);

            if(challenges.contains(tool*substance)){
                substances.remove(substances.size()-1);
                challenges.remove(challenges.indexOf(tool*substance));
            }else{
                tools.add(tool+1);
                substances.set(substances.size()-1, substance-1);
                if(substances.get(substances.size()-1)<=0){
                    substances.remove(substances.size()-1);
                }
                
            }
            
        
        }

        if(won){
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }else{
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if(tools.size()!=0){
            System.out.print("Tools: ");
            System.out.println(tools.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
        
        if(substances.size()!=0){
            System.out.print("Substances: ");
            System.out.println(substances.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }

        if(tools.size()!=0){
            System.out.print("Challenges: ");
            System.out.println(challenges.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }
            

        
        
            
    }
}
