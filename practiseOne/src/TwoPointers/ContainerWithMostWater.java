package TwoPointers;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,7,2,5,4,7,3,6};
        int area = maxArea(heights);
        int area1 = areaOn(heights);
        System.out.println(area);
        System.out.println("area1:  " + area1);
    }

    private static int areaOn(int[] heights) {
        int area = 0;
        int l = 0; int r = heights.length-1;
        while(l<r){
         int areaTemp = (r-l)*(min(heights[l],heights[r]));
         area = max(area, areaTemp);
         if(heights[l]<heights[r]){
             l++;
         }
         else{
             r--;
         }
        }
        return area;
    }

    //O(n^2)
    private static int maxArea(int[] heights) {
        int area = 0;
        int maxVolume = 0;
        for(int i = 0; i< heights.length; i++){
            int sidea = heights[i];
            for(int j= heights.length-1; j>=0; j--){
                int sideb = heights[j];
                int side = min(sideb, sidea);
                int width = j-i;
                int vol = side * width;
                System.out.println("i: = : " + i + " J: = "+ j+ " : sidea: = "+ sidea + "  :  sideb: = "+ sideb + "  :  side: = "+ side + "  : Vol: = "+ vol + "  : MaxVol: = "+ maxVolume);
                if(vol > maxVolume){
                    maxVolume = vol;
                }


            }

        }
        return maxVolume;
    }


}
