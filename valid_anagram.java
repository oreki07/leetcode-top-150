/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case? */


import java.util.*;
class valid_anagram{
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) //if the letters are not anagram then return false 
            return false;
        int[] count = new int [26]; // count frequency of the letters 
        for(int i = 0 ; i<s.length(); i++){
            count[s.charAt(i)- 'a']++; // important ( add characters )
            count[t.charAt(i) - 'a']--; // important ( remove characters )

        }
        for(int c : count){
            if(c!=0)
                return false;
        }
        return true;
            
    }
    
}
