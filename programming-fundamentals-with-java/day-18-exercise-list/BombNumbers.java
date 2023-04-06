import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BombNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tmp=scanner.nextLine().split(" ");

        int power=Integer.parseInt(tmp[0]);
        int range=Integer.parseInt(tmp[1]);

         for(int i=0; i<nums.size(); i++){
            if (nums.get(i)==power){
                int destroyStart=Math.max(0, i-range);
                int destroyEnd=Math.min(nums.size()-1, i+range);
                for(int j=destroyStart; j<=destroyEnd; j++){
                    nums.remove(destroyStart);
                }

                i--;
            }
        }
        int sum=0;
        for(Integer num : nums)
            sum+=num;
        System.out.println(sum);

    }
}
