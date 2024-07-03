import java.util.Arrays;

/*
Input: arr[] = {10, 20, 10, 5, 15}
Output: prefixSum[] = {10, 30, 40, 45, 60}
Explanation: While traversing the array,
update the element by adding it with its previous element.
 */
public class PrefixSums {
    public static void main(String[] args) {
        int[] prefixArray = {10, 20, 10, 5, 15};
        preFixSumArray(prefixArray);
    }

    private static void preFixSumArray(int[] prefixArray) {
        int[] NewSumArray = new int[prefixArray.length];
        int startprefix = 0;
        for(int i = 0; i <prefixArray.length; i++){
            //System.out.println(startprefix);
            startprefix = prefixArray[i] + startprefix;
            prefixArray[i] = startprefix;

        }
        System.out.println(Arrays.toString(prefixArray));
    }
}
