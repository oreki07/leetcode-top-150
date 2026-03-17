/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1 

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?

*/


import java.util.*;
public class Pascal_Triangle_2 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>(); // created a row index 
        row.add(1); // adding 1 in the begining 
        for(int i = 0; i <= rowIndex; i++){ // the loop starts from 0 to rowIndex 
            for(int j = i-1 ; j > 0 ; j++){ // the loop starts from the i-1 to 1 
                row.set(j, row.get(j) + row.get(j-1)); // here the j-1 is the left neightbor of right element  -> we are going from right to left 
            }
            row.add(1); // this will add 1 at the last of every iteration 

        }
        return row; // return the answer 
    }

    
}
