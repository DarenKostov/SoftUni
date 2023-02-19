import java.util.Scanner;

class MaxSequenceOfEqualElements{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input=scanner.nextLine().split(" ");
        int[] nums=new int[input.length];
        for(int i=0; i<nums.length; i++){
            nums[i]=Integer.parseInt(input[i]);
        }

        int longestSequence=1234;
        int longestLength=0;

        for(int i=0; i<nums.length; i++){
            
            int thisSequence=nums[i];
            int thisLength=1;

            for(int j=i+1; j<nums.length; j++){
                if(thisSequence!=nums[j])
                    break;
                thisLength++;     
            }

            if(thisLength>longestLength){
                longestSequence=thisSequence;
                longestLength=thisLength;
            }
            
        }
        
        for(int i=0; i<longestLength; i++){
            System.out.printf("%d ", longestSequence);
        }
        System.out.println();
    }
}
