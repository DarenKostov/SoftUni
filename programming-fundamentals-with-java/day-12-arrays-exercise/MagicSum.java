import java.util.Scanner;

class MagicSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        int[] nums=new int[input.length];
        for(int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(input[i]);
        }

        int sum=Integer.parseInt(scanner.nextLine());

        //I wonder if it would be considered valid of i started the loop from the
        //end meaning all pairs would be reverse/mixed but still valid
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==sum){
                    System.out.printf("%d %d\n", nums[i], nums[j]);
                    break;
                }    
            }
        }
    }
}
