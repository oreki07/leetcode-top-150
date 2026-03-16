/*Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 */


import java.util.*;
public class Maximum_Product_SubArray {
    public int maxProduct(int[] nums){

        int max = nums[0] ; // maximum product ending at current index 
        int min = nums [ 0] ; // minimum product ending at current index
        int result = nums [0]; // largest current found so far 

        for(int i = 1; i< nums.length; i++){ // loop through the array 
            int temp= max; // we put the old max value because max will change before calculating min
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));// update maaximum product 
            min = Math.min(nums[i] , Math.min(temp * nums[i], min * nums [i])); // update minimum product
            result = Math.max(result, max);  // storing maximum value

        }
        return result;
    }
    
}
