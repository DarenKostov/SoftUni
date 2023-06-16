import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Employee>> departments=new HashMap<>();
        Map<String, Double> departmentSalary=new HashMap<>();
        
        int num=Integer.parseInt(scanner.nextLine());
    
        for(int i=0; i<num; i++){
            String[] input=scanner.nextLine().split(" ");
            departments.putIfAbsent(input[3], new ArrayList<>());
            departmentSalary.putIfAbsent(input[3], 0.0);
            departmentSalary.put(input[3], departmentSalary.get(input[3])+Double.parseDouble(input[1]));

            if(input.length==6){
                departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[4], Integer.parseInt(input[5])));
                continue;
            }

            if(input.length==4){
                departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], "n/a", -1));
            }else if(input[4].contains("@")){
                departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], input[4], -1));
            }else{
                departments.get(input[3]).add(new Employee(input[0], Double.parseDouble(input[1]), input[2], "n/a", Integer.parseInt(input[4])));
            }
            
        }

        String highestSalaryDepartment="";
        double highestSalary=0.0;
        for(Map.Entry<String, Double> department : departmentSalary.entrySet()){
            double averageSalary=department.getValue()/departments.get(department.getKey()).size();
            if(averageSalary>highestSalary){
                highestSalaryDepartment=department.getKey();
                highestSalary=averageSalary;
            }
        }

        System.out.println("Highest Average Salary: "+highestSalaryDepartment);
        departments.get(highestSalaryDepartment).stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
        

        
    }
}
