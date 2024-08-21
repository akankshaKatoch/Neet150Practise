package TwoPointers;

public class maxWaterRetain {
    public static void main(String[] args) {
       int[] height = {0,2,0,3,1,0,1,3,2,1};
       int vol =  maxWaterRain(height);
        System.out.println(vol);
    }

    private static int maxWaterRain(int[] height) {
        int volume =0;
        int l =0;
        int r = height.length-1;
        int heightLeftMax = height[l];
        int heightRightMax = height[r];

        while(l<r){
            int tempVolume = (r-l)*Math.min(height[l],height[r]);
            volume = Math.max(tempVolume, volume);

        if(height[r]<height[l]){
            r--;
        }
        else {
            l++;
        }
        }
        return volume;
    }
}
