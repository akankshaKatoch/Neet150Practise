package ArrayQuestions;

public class ValidateSoduko {
    public static void main(String[] args) {
        char[][] suduko = {{'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isSudukoValid(suduko));
    }
    /*
    Algo implementation understanding
     */
    private static boolean isSudukoValid(char[][] suduko) {

        return false;
    }
}
