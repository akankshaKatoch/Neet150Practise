package TwoPointers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeIntegerSum {
    public static void main(String[] args) {
        //int[] array = {-3,3,4,-3,1,2};
        int[] array = {0,0,0,0};
        int target = 0;
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        myList = isThreeSumZero(array, target);
        for(List<Integer> a : myList){
            System.out.println("[");
            for(Integer b: a){
                System.out.println( b);
            }
            System.out.println("]");
        }
    }

    private static List<List<Integer>> isThreeSumZero(int[] array, int target) {
        Arrays.sort(array);
        Integer prevValue = null;
        List< List<Integer>> intList = new ArrayList<List<Integer>>();

        for(int i= 0; i<=array.length-1; i++) {
            System.out.println("i  ->  " + i + " value:  ->" + array[i]);
                if (prevValue!=null && prevValue == array[i]){
                    System.out.println("cont" + array[i]);
                    continue;
                }
                else{
                    prevValue = array[i];
                }

            int j = i + 1;
            System.out.println("j -->  " + j);
            int k = array.length - 1;
            System.out.println("k --> " + k);
            while (j < k){

                int sum = array[i] + array[j] +array[k];
                System.out.println("Sum" + sum +" {" + array[i] + array[j] +array[k]+ "}");
                if(sum == 0){
                    System.out.println("I am here: sum == target");
                    List<Integer> smallList = new ArrayList<Integer>();
                    smallList.add(array[i]);
                    smallList.add(array[j]);
                    smallList.add(array[k]);
                    System.out.println("I am ");
                    intList.add(smallList);
                    j++;
                    k--;
                    while(j<k && array[j] == array[j-1]){
                        j++;
                    }
                }
                if(sum < 0){
                    System.out.println("I am here: sum < target");
                   j++;
                }
                if (sum > 0){
                    System.out.println("I am here: sum > target");
                    k--;
                }

            }

        }



return intList;

    }
}
