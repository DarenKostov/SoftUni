import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Race{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] initRacers=scanner.nextLine().split(", ");

        LinkedHashMap<String, Integer> racers = new LinkedHashMap<>();

        for(String name : initRacers)
            racers.put(name, 0);

        String regexLetters = "[A-Za-z]*";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String timeRegex = "[0-9]*";
        Pattern patternTime = Pattern.compile(timeRegex);


        int firstD=0;
        int secondD=0;
        int thirdD=0;
        
        String firstS="";
        String secondS="";
        String thirdS="";

        
        for(String command=scanner.nextLine(); !command.equals("end of race"); command=scanner.nextLine()){

            String name="";
            String distanceS="";
            
            Matcher matcherLetters = patternLetters.matcher(command);
            while (matcherLetters.find()){
                name+=matcherLetters.group();
            }

            Matcher matcherTime = patternTime.matcher(command);
            while (matcherTime.find()){
                distanceS+=matcherTime.group();
            }
            
            int distance=0;
            for (int j=0; j<distanceS.length(); j++) {
                distance+=Integer.parseInt(""+distanceS.charAt(j));
            }


            
            if(racers.get(name)!=null){
                racers.put(name, racers.get(name)+distance);

                if(racers.get(name)>firstD){
                    firstS=name;
                    firstD=racers.get(name);
                }else if(racers.get(name)>secondD){
                    secondS=name;
                    secondD=racers.get(name);
                }else if(racers.get(name)>thirdD){
                    thirdS=name;
                    thirdD=racers.get(name);
                }
                
                
                   
            }
            
        }

        System.out.printf("1st place: %s\n", firstS);
        System.out.printf("2nd place: %s\n", secondS);
        System.out.printf("3rd place: %s\n", thirdS);
        
        
    }
}
