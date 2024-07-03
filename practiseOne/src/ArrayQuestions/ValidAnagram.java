package ArrayQuestions;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecare";
        String d = "carrace";

        boolean isAnagram = isAnagram(s,d);


    }

    private static boolean isAnagram(String s, String d) {
        int[] store = new int[26];

        if(s.length() != d.length())
            return false;

        for(int i = 0; i< s.length(); i++){
            store[s.charAt(i)-'a']++;
            store[d.charAt(i) - 'a']--;

        }

        for(int n : store) if (n!=0)return false;
        return true;
    }
}
