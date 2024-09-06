package TwoPointers;

public class maxWaterRetain {
    public static void main(String[] args) {
       int[] height = {0,2,0,3,1,0,1,3,2,1};
       int vol =  maxWaterRain(height);
        System.out.println(vol);
    }


    //using 2 pointers.
    private static int maxWaterRain(int[] height) {
        int l =0;
        int r = height.length-1;
        int waterTrapped = 0;
        int leftMax = height[l];
        int rightMax = height[r];

        while(l<r){
            System.out.println("L : " + l + "  R : " + r);
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(leftMax,height[l]);

                waterTrapped = waterTrapped + (leftMax-height[l]);
                System.out.println("leftMax : " + leftMax + " waterTrapped : " + waterTrapped + " height[l] : " + height[l]);

            }
            else{
                r--;
                rightMax = Math.max(rightMax,height[r]);
                waterTrapped = waterTrapped + (rightMax-height[r]);
                System.out.println("rightMax : " + rightMax + " waterTrapped : " + waterTrapped + " height[r] : " + height[r]);

            }
        }
        return waterTrapped;
    }
}
