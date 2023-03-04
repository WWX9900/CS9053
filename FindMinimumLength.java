import java.util.*;
class FindMinimumLength {
    public static int minSubArrayLen(int goal, int[] nums) {
        int minimumLength=0;
        if(nums.length == 0){
            return minimumLength;
        }
        Arrays.sort(nums);
        for(int i = nums.length-1;i>=0;i--){
            goal = goal-nums[i];
            minimumLength++;
            if(goal <= 0){
                return minimumLength;
            }
        }
        return minimumLength;
    }
    
    public static void main(String[] args) {
    	int[] array1 =   {10,2,3,11};
    	System.out.println(minSubArrayLen(11, array1)); 
    	int[] array2 =   {5, 6, 8, 2};
    	System.out.println(minSubArrayLen(7, array2));
    }
}
