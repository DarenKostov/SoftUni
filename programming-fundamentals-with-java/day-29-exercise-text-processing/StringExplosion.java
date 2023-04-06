import java.util.Scanner;

class StringExplosion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();

        int addedStrength=0;

        for(int i=0; i<str.length(); i++){

            System.out.print(str.charAt(i));
            if(str.charAt(i)=='>'){
                int strength=(str.charAt(i+1)-'0')+addedStrength;

                for(;;){
                    i++;
                    strength--;

                    if(i>=str.length())
                        break;

                    if(str.charAt(i)=='>'){
                        i--;
                        strength++;
                        break;
                    }


                    if(strength<1)
                        break;
                    
                    
                }
                addedStrength=strength;
            }
        
        }
        System.out.println();

    }
}
