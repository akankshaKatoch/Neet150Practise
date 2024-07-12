package ArrayQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSuduko {
    public static void main(String[] args) {
        /*char[][] suduko = {{'1','9','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','2','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}};*/
        char[][] suduko = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(suduko.length);
        System.out.println(isSudukoValid(suduko));
    }
/*how we can solve suduko.
1.) check each row dont have duplicate.
each value comparison
2.) each column dont have duplicate.
each value comparision
4.) each 9 block dont have duplicate.
 */

    private static boolean isSudukoValid(char[][] suduko) {
        char a = 'a';


        System.out.println("Row check starts");
        //Validate Rows.
        for(int i = 0 ; i < suduko.length; i++){
            HashSet<Character> rowSet = new HashSet<>(9);
            for(int j = 0; j < 9; j++ ){
                if(suduko[i][j]!='.' && !rowSet.add(suduko[i][j])){

                    return false;
                }
            }
        }

        System.out.println("Column check starts");
        //Validate Columns.
        for(int i = 0 ; i < suduko.length; i++){
            HashSet<Character> column = new HashSet<>(9);
            for(int j = 0; j < 9; j++ ){
                if(suduko[j][i]!='.' && !column.add(suduko[j][i])){
                    return false;
                }
            }
        }

        System.out.println("Grid check starts");
        //grid check.
        for(int i = 0 ; i < 7 ; i += 3){
            System.out.println("GridColumn : " + i);
            for(int j= 0; j< 7; j += 3){
                System.out.println("GridRow : " + j);
                HashSet<Character> grid = new HashSet<>(9);

                for(int p = i; p < i+3; p++){
                    System.out.println("Column : " + p);
                    for(int q = j; q<j+3; q++){
                        System.out.println("Row : " + q);
                        System.out.println("p: "+ p + " q: "+ q + "Value: " + suduko[p][q]);
                        if(suduko[p][q]!='.' && !grid.add(suduko[p][q])){
                            return false;
                        }
                    }

                }


            }
        }

        return true;

    }
}
