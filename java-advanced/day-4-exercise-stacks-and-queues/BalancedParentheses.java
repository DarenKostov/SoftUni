import java.util.*;

class BalancedParentheses{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        String parentheses=scanner.nextLine();
        ArrayDeque<Character> parenthesesStack = new ArrayDeque<>();

        boolean balanced=true;
        
        outer:
        for(int i=0; i<parentheses.length(); i++){
            
            switch(parentheses.charAt(i)){
                case ')':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop()!='('){
                        balanced=false;
                        break outer;
                    }
                    break;
                case ']':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop()!='['){
                        balanced=false;
                        break outer;
                    }
                    break;
                case '}':
                    if(parenthesesStack.isEmpty() || parenthesesStack.pop()!='{'){
                        balanced=false;
                        break outer;
                    }
                    break;
                default:
                    parenthesesStack.push(parentheses.charAt(i));
                    break;

            }
        
        }


        if(balanced && parenthesesStack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
