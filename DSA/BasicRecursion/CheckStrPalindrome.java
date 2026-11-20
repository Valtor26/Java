package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public Boolean isStrPalindrome(String str,int start,int end){
        if(start >= end) return true;
        
        char first = str.charAt(start);
        char second = str.charAt(end);

        if(first != second) return false;

        return isStrPalindrome(str, start+1, end-1);
    }
}

public class CheckStrPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");

        String str = sc.nextLine();

        Solution s = new Solution();

        System.out.println(s.isStrPalindrome(str, 0, str.length()-1) ? "Yes" : "No");

    }
}