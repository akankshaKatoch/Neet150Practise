public class DuplicateInteger {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(hasDuplicates(nums));

    }

    public static boolean hasDuplicates(int[] nums){
        int match;
        int value;
        for(int i=0; i<= nums.length-1; i++)
        {
          value = nums[i];
            System.out.println("Here" + value);
          int counter = i+1;
          for(int j= counter; j<=nums.length-1; j++)
          {System.out.println(nums[j]);
             if(value == nums[j]){
                 return true;
             }
          }
        }

    return false;
     }
}
