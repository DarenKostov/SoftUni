import java.util.Scanner;

class StringManipulator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();

        for(String[] command=scanner.nextLine().split(" "); !command[0].equals("End"); command=scanner.nextLine().split(" ")){
            switch(command[0]){
                case "Translate":
                    str=str.replaceAll(command[1], command[2]);
                    System.out.println(str);
                    break;            
                case "Includes":
                    System.out.println(str.contains(command[1])? "True" : "False");
                    break;            
                case "Start":
                    System.out.println(str.startsWith(command[1])? "True" : "False");
                    break;            
                case "Lowercase":
                    str=str.toLowerCase();
                    System.out.println(str);
                    break;            
                case "FindIndex":
                    for(int i=str.length()-1; i>=0; i--)
                        if(str.charAt(i)==command[1].charAt(0)){
                            System.out.println(i);
                            break;
                        }
                    break;            
                case "Remove":
                    int start=Integer.parseInt(command[1]);
                    int end=start+Integer.parseInt(command[2]);
                    str=str.substring(0, start)+str.substring(end);
                    System.out.println(str);
                    break;            
            
            }        
        
        }
        
    }


    
}
