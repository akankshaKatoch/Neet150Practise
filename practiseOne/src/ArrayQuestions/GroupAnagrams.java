package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"act", "pots", "tops", "cats", "stop", "hats"};

        List<List<String>> lists;
        lists = groupAnagrams(strs);
        System.out.println(lists);

    }

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> myMap = new HashMap<>();
       for(String s : strs){
           int[] a = new int[26];
           for(char b : s.toCharArray()){
               a[b - 'a']++;

           }
           String key = Arrays.toString(a);
           if(!myMap.containsKey(key)){
               myMap.put(key,new ArrayList<>());
           }
           myMap.get(key).add(s);
       }


        return new ArrayList<>(myMap.values());
    }
}
