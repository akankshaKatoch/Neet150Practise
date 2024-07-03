package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeString {
    public static void main(String[] args) {
        String[] list = {"neet", "code", "love", "you"};
        List<String> strs = Arrays.asList(list);
        String newString = encodeList(strs);
        decodeString(newString);

    }

    private static void decodeString(String newString) {
        List<String> list= new ArrayList<String>();
        int i = 0;
        while(i < newString.length()){
            int j = i;
            while(newString.charAt(j)!='#'){
                j++;
            }
            int length = Integer.valueOf(newString.substring(i,j));


            i = j+1+length;
            list.add(newString.substring(j+1, i));
        }
         for(String listElement: list){
            System.out.println("listElement" + listElement);
        }
    }


    private static String encodeList(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for (String element : list) {
            sb.append(element.length()).append('#').append(element);
        }
        System.out.println(("encoded output: " + sb.toString()));
        return sb.toString();
    }
}
