import java.util.*;

class CompanyUsers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        LinkedHashMap<String, List<String>> companies = new LinkedHashMap<>();
                        
        for(String[] input=scanner.nextLine().split(" -> "); !input[0].equals("End"); input=scanner.nextLine().split(" -> ")){
            companies.putIfAbsent(input[0], new ArrayList<String>());

            if(!companies.get(input[0]).contains(input[1]))
                companies.get(input[0]).add(input[1]);

            
        }

        for(Map.Entry<String, List<String>> company : companies.entrySet()){
            System.out.printf("%s\n", company.getKey());
            for(String id : company.getValue()){
                System.out.printf("-- %s\n", id);
            }
        }

    }
}
