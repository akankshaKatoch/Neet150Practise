import java.util.Arrays;

public class ProductsofArrayDiscludingSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        System.out.println(nums);
        int[] numsMultiply = new int[nums.length];
        numsMultiply = productExceptSelf(nums);

        System.out.println(Arrays.toString(numsMultiply));

    }

    private static int[] productExceptSelf(int[] nums) {
        int[] multipliedNums = new int[nums.length];
        /*
        using O(n^2) complexity
        for(int i = 0; i< nums.length;i++){

            int multipied = 1;
            for(int k = 0; k< nums.length; k++){
                if(i != k)
                multipied = multipied*nums[k];
            }
            System.out.println(multipied);
            multipliedNums[i]= multipied;
        }

         */
        int prefix = 1;
        for (int i = 0; i<nums.length; i++){
            multipliedNums[i] = prefix;
            prefix  = prefix * nums[i];
        }
        int postfix = 1;
        for(int i = nums.length-1; i>=0; i--){
            multipliedNums[i] = multipliedNums[i] * postfix;
            postfix = nums[i] * postfix;
        }
        return multipliedNums;
    }

}
