import java.util.Scanner;

class ArrayModifier{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        int[] nums=new int[input.length];
        for(int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(input[i]);
        }

        input=scanner.nextLine().split(" ");

        while(!input[0].equals("end")){
            switch(input[0]){
                case "swap":
                    int index1=Integer.parseInt(input[1]);
                    int index2=Integer.parseInt(input[2]);
                
                    int temp=nums[index1];
                    nums[index1]=nums[index2];
                    nums[index2]=temp;
                    break;
                case "multiply":
                    index1=Integer.parseInt(input[1]);
                    index2=Integer.parseInt(input[2]);
                    nums[index1]*=nums[index2];
                    break;
                case "decrease":
                    for(int i=0; i<nums.length; i++){
                        nums[i]--;
                    }
                
            }
        
            input=scanner.nextLine().split(" ");
        }

        for(int i=0; i<nums.length-1; i++){
            System.out.printf("%d, ", nums[i]);
        }

        System.out.printf("%d\n", nums[nums.length-1]);
    }
}
