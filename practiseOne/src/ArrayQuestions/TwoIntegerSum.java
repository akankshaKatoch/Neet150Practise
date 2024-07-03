package ArrayQuestions;

/*
*?Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.
 */
public class TwoIntegerSum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] values = twoSum(nums, target);
        for( int n : values) {
            System.out.println(n);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] valueArray = new int[2];
         for(int i = 0; i<nums.length; i++ ) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {
                     valueArray[0] = i;
                     valueArray[1] = j;
                     return valueArray;
                 }
             }
         }


        return valueArray;
    }
}
