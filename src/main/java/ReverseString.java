/*
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */


package main.java;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("String before reversal: " + s);

        System.out.println("String after reversal: " + reverseString(s.toCharArray()));
    }

    public static String reverseString(char[] s) { // O(n), O(1)
        int start = 0, finish = s.length - 1;
        while(start <= finish){
            char c = s[start];
            s[start++] = s[finish];
            s[finish--] = c;
        }
        return new String(s);
    }
}
