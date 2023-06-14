import java.util.*;


class Crossfire{




        static List<List<Integer>> grid= new ArrayList<>();





    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] rowNCol=scanner.nextLine().split(" ");
        int rows=Integer.parseInt(rowNCol[1]);
        int cols=Integer.parseInt(rowNCol[0]);


        
        for(int x=0; x<cols; x++){
            grid.add(new ArrayList<>());
            for(int y=0; y<rows; y++){
                grid.get(x).add(y+x*rows+1);
            }
        }


        String[] command=scanner.nextLine().split(" ");
        while(!command[0].equals("Nuke")){
            int x=Integer.parseInt(command[0]);
            int y=Integer.parseInt(command[1]);
            int r=Integer.parseInt(command[2]);

            for(int i=Math.max(0, x-r); i<Math.min(grid.size(), x+r+1); i++){
                if(inRange(i, y)){
                    grid.get(i).set(y, 0);
                }
            }
            for(int i=Math.max(0, y-r); i<Math.min(grid.size(), y+r+1); i++){
                if(inRange(x, i)){
                    grid.get(x).set(i, 0);
                }
            }

        for(List<Integer>  elements: grid){
            elements.removeIf(value->value==0);
        }
        grid.removeIf(List::isEmpty);


        
        command=scanner.nextLine().split(" ");
        }
        for (List<Integer>  elements: grid){
            for (int element: elements) {
                System.out.print(element+" ");
            }
        System.out.println();
        }
        
        
    }





    static boolean inRange(int x, int y){
    
        if(x<0 || y<0 || x>=grid.size() || y>=grid.get(x).size()){
            return false;
        }


        return true;
    }






    
}
