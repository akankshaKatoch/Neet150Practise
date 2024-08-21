package normalPartice;

public class backspaceStringComapareHackerRank {
    public static void main(String[] args) {
        String s1 = "AXX#BB#C";
        String s2 = "AXBD#C#C";
        int truefalse;
        truefalse = stringCompare(s1, s2);
        System.out.println("hello " + truefalse);

    }

    private static int stringCompare(String s1, String s2) {
        StringBuffer sb1 = new StringBuffer();
        int i = getWithOutBackSpace(s1).compareTo(getWithOutBackSpace(s2));
        if(i == 0){
            return 1;
        }

        return 0;
    }

    private static String getWithOutBackSpace(String s1) {
        int position = 0;
        for(int a = 0; a<s1.length(); a++){
            if (s1.charAt(a) != '#'){
                System.out.println("here  : " + a + "String " + s1);
                s1 = s1.substring(0,position) + s1.charAt(a) + s1.substring(position+1);
                //s1.replace((char) (s1.charAt(a-1)+s1.charAt(a)),empty);
                position++;
            }
            else{
                System.out.println("here" );
                position--;
            }
            if(position<0){
                position=0;
            }

        }
        return s1.substring(0,position);
    }
}
