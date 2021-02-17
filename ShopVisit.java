
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShopVisit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = Integer.parseInt(in.nextLine());
        char[][] grid = new char[M][M];

        for (int i = 0; i < grid.length; i++) {
            String s = in.next();

            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        
        int largestConsec = 0;
        int currCount = 0;
        char curr = 'E';
        char next = ' ';

        for (int i = 0; i < M; i++) {//column
            currCount = 0;
            for (int j = 0; j < M; j++) {//row
                next = grid[j][i];
                if (curr == next)  {
                    currCount++;
                    if (currCount > largestConsec) {
                        largestConsec = currCount;
                    }
                }
                else {
                    curr = next;
                    currCount = 0;
                    currCount++;
                }
            }
        }
        System.out.println(largestConsec);
    }
}