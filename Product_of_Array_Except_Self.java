/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.) */

import java.util.*;
public class Product_of_Array_Except_Self {
    public int[] productSelfArray(int[] nums){
        int n = nums.length;
        int[] results = new int[n];
    
    // prefix 
        results[0] = 1;
        for(int i = 1; i < nums.length; i++){
            results[i] = results[i-1] * nums[i-1];// eg : i =1 ; so 1-1 = 0 for result , 1-1 = 0 for nums so 1 *1 = 1 so [0]  
            // will be 1 and if i=2 then 2-1 = 1 for result and 2-1 for num and then if we product them the answer
            //  will again be 1 so 1 1 0 0 then next time 1 1 2 0 then 1 1 2 6 

        
        }
        int suffix = 1;
        for(int i = n-1; i >= 0; i--){ // if i = 3 then result [3] * suffix is 1 so 6 * 1 = 6; 
            results[i] = results[i] *suffix;
            suffix *= nums[i];// when updating suffix ; 1* 4 = 4;

        }
        return results;
    
    
    }
}

    

    

