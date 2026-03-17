/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1 

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
 


*/

import java.util.*;
public class Pascal_Triangle {
    public List<List<Integer>> generate (int numRows){
        int[][] dp = new int [numRows][numRows]; // dp array creation 

        List<List<Integer>> result = new ArrayList<>(); // creating a result list 

        for(int i = 0; i <= numRows ; i++){ // outer loop (rows)

            List<Integer> row = new ArrayList<>(); // create new list row 

            for(int j = 0 ; i <= i ; i++){ // inner loop for (columns)
                if(j == 0 || j == i ){ // the first and last element will always be 1
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j]; // basically take an example of dp [3][1] = dp[i-1 = 2][j-1 = 0] + dp[2][1] so the answer will be 2 + 1 = 3
                }
                row.add(dp[i][j]); 
            }
            result.add(row);

        }
        return result;


    }
    
    
}
