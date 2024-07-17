package TwoPointers;

import java.sql.Array;

public class TwoIntegerSum {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4};
        int target = 7;
        int[] finalNos = twoSum(numbers, target);
        for(int a : finalNos) {
            System.out.println(a);
        }

    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] finalNos = new int[2];
        int point = 0;
        for(int i= 0; i<numbers.length; i++){
            point = numbers[i];
            //finalNos[0] = point;
                for(int k = i+1 ; k<numbers.length; k++){
                    if(point + numbers[k] == target){
                        finalNos[0] = i+1;
                        finalNos[1] = k+1;
                        return finalNos;
                    }
                }
        }
        return finalNos;
    }
}
