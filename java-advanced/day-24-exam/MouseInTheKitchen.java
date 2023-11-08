import java.util.*;
import java.util.function.*;

class MouseInTheKitchen{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        String[] nums=scanner.nextLine().split(",");
        int N=Integer.parseInt(nums[0]);
        int M=Integer.parseInt(nums[1]);

        char[][] board=new char[M][N];

        int[] cheeseLeft={0};
        boolean[] danger={false};
        boolean[] trapped={false};
        boolean outOfBounds=false;

        
        for(int y=0; y<N; y++){
            String input=scanner.nextLine();
            for(int x=0; x<M; x++){
                board[x][y]=input.charAt(x);
                if(input.charAt(x)=='C'){
                    cheeseLeft[0]++;
                }
            }
        }

        Supplier<Integer[]> getMouse=()->{
            Integer[] output={-1, -1};
            
            for(int y=0; y<N; y++){
                for(int x=0; x<M; x++){
                    if(board[x][y]=='M'){
                        output[0]=x;
                        output[1]=y;
                        return output;
                    }
                }
            }
            return output;
        };
        

        BiPredicate<Integer, Integer> withinBounds=(x, y)->{
            if(x<0)
                return false;
            if(y<0)
                return false;
            if(x>=M)
                return false;
            if(y>=N)
                return false;
            
            return true;
        };

        BiFunction<Integer, Integer, Boolean> placeMouse=(x, y)->{
            if(board[x][y]=='C'){
                cheeseLeft[0]--;
                board[x][y]='M';
                return true;
            }
            if(board[x][y]=='T'){
                trapped[0]=true;
                board[x][y]='M';
                return true;
            }
            if(board[x][y]=='@'){
                return false;
            }
            if(board[x][y]=='*'){
                board[x][y]='M';
                return true;
            }
            return false;
        
        };

        while(true){
            if(cheeseLeft[0]==0 || danger[0] || trapped[0] || outOfBounds){
                break;
            }

            String command=scanner.nextLine();


            switch(command){
                case "danger":
                    danger[0]=true;
                    break;
                case "up":
                    Integer[] coords=getMouse.get();
                    if(withinBounds.test(coords[0], coords[1]-1)){
                        if(placeMouse.apply(coords[0], coords[1]-1)){
                            board[coords[0]][coords[1]]='*';
                        }
                    }else{
                        outOfBounds=true;
                    }
                    break;
                case "down":
                    coords=getMouse.get();
                    if(withinBounds.test(coords[0], coords[1]+1)){
                        if(placeMouse.apply(coords[0], coords[1]+1)){
                            board[coords[0]][coords[1]]='*';
                        }
                    }else{
                        outOfBounds=true;
                    }
                    break;
                case "right":
                    coords=getMouse.get();
                    if(withinBounds.test(coords[0]+1, coords[1])){
                        if(placeMouse.apply(coords[0]+1, coords[1])){
                            board[coords[0]][coords[1]]='*';
                        }
                    }else{
                        outOfBounds=true;
                    }
                    break;
                case "left":
                    coords=getMouse.get();
                    if(withinBounds.test(coords[0]-1, coords[1])){
                        if(placeMouse.apply(coords[0]-1, coords[1])){
                            board[coords[0]][coords[1]]='*';
                        }
                    }else{
                        outOfBounds=true;
                    }
                    break;
            }


        // for(int y=0; y<N; y++){
        //     for(int x=0; x<M; x++){
        //         System.out.print(board[x][y]);
        //     }
        //     System.out.println();
        // }

            
        }

        if(cheeseLeft[0]==0){
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        }else if(trapped[0]){
            System.out.println("Mouse is trapped!");
        }else if(danger[0]){
            System.out.println("Mouse will come back later!");
        }else if(outOfBounds){
            System.out.println("No more cheese for tonight!");
        }
        

        for(int y=0; y<N; y++){
            for(int x=0; x<M; x++){
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
                 
    }
}
