//https://www.hackerrank.com/challenges/magic-square-forming/problem

package Practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FormingAMagicSquare {

}

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int row0 = s[0][0] + s[0][1] + s[0][2];
        int row1 = s[1][0] + s[1][1] + s[1][2];
        int row2 = s[2][0] + s[2][1] + s[2][2];
        int col0 = s[0][0] + s[1][0] + s[2][0];
        int col1 = s[0][1] + s[1][1] + s[2][1];
        int col2 = s[0][2] + s[1][2] + s[2][2];

        if (row0 == row1 && row0 == row2 && col0 == col1 && col0 == col2) return 0;
        else return magic(s, 0);
    }

    static int magic(int[][] s, int cost) {

        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
