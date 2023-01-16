import java.util.Scanner;
class Walking{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean goingHome=false;
        int totalSteps=0;
        
        
        while(totalSteps<10000){
            String action=scanner.nextLine();
            if(action.equals("Going home")){
                goingHome=true;
                break;
            }
            totalSteps+=Integer.parseInt(action);
        
        }
        
        if(goingHome){
            int stepsHome=Integer.parseInt(scanner.nextLine());
            totalSteps+=stepsHome;
        }
        
        if(totalSteps<10000){
            System.out.println(10000-totalSteps+" more steps to reach goal.");
        }else{
            System.out.println("Goal reached! Good job!");
            System.out.println(totalSteps-10000+" steps over the goal!");
        
                        
        }
        
    }
}
