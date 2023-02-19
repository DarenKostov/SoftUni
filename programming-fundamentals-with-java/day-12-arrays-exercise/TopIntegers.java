import java.util.Scanner;

class TopIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] input=scanner.nextLine().split(" ");


        int[] nums=new int[input.length];
        for(int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(input[i]);
        }

        for(int i=0; i<nums.length; i++){
            boolean topInteger=true;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<=nums[j]){
                    topInteger=false;
                    break;
                }
            
            }
            if(topInteger)
                System.out.printf("%d ", nums[i]);
        }        
        System.out.println();

    }
}
