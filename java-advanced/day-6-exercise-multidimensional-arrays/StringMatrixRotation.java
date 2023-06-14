import java.util.*;

class StringMatrixRotation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int rotation=Integer.parseInt(scanner.nextLine().split("[()]")[1])%360;
        List<String> strings=new ArrayList<>();


        //get all strings
        int maxLength=0;
        String newString=scanner.nextLine();
        while(!newString.equals("END")){
            strings.add(newString);
            maxLength=Math.max(maxLength, newString.length());
            newString=scanner.nextLine();
        }


        //make all the same length
        for(int i=0; i<strings.size(); i++){
            while(strings.get(i).length()!=maxLength){
                strings.set(i, strings.get(i)+" ");
            }
        }

        switch(rotation){
            case 0:
                for(String element: strings) {
                    System.out.println(element+" ");
                }
                break;
            case 90:
                for(int j=0; j<maxLength; j++){
                    for(int i=strings.size()-1; i>=0; i--){
                        System.out.print(strings.get(i).charAt(j));
                    }
                    System.out.println();
                }
                break;
            case 180:

                for(int i=strings.size()-1; i>=0; i--){
                    for(int j=maxLength-1; j>=0; j--){
                        System.out.print(strings.get(i).charAt(j));
                    }
                    System.out.println();
                }
                break;
            case 270:
                for(int j=maxLength-1; j>=0; j--){
                    for(int i=0; i<strings.size(); i++){
                        System.out.print(strings.get(i).charAt(j));
                    }
                    System.out.println();
                }
                break;
            
            
        
        }

        
        
    }
}
