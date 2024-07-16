package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
       // String s = "Was it a car or a cat I saw?";
       // String s = "tab a cat";
        String s = "Madam, in Eden, I'm Adam";
        Boolean b = isValidPalindrome(s);
        System.out.println(b);
    }

    private static boolean isValidPalindrome(String s1) {
        String s2 = s1.replaceAll("[^a-zA-Z0-9 -]", "");
        String s = s2.replaceAll("\\s", "");
        //String s =s3.toLowerCase();
        //System.out.println(s);
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2 && j > i; i++) {
            System.out.println("s.charAt(i):  " + s.charAt(i) + "  s.charAt(j):  " + s.charAt(j));
            System.out.println(Character.compare(Character.toLowerCase(s.charAt(i)), Character.toLowerCase(s.charAt(j))));
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            j--;
        }
        return true;
    }
}
