/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

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
        int[][] dp = new int [numRows][numRows];

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i <= numRows ; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0 ; i <= i ; i++){
                if(j == 0 || j == i ){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
                row.add(dp[i][j]);
            }
            result.add(row);

        }
        return result;


    }
    
    
}
