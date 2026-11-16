package DSA.BasicString;

import java.util.Scanner;

class Solution{
    public Boolean isPalindrome(String str){
        str = str.toLowerCase();
        int n = str.length();
        if(n == 0) return false;
        if(n == 1) return true;
        
        int left = 0;
        int right = n-1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(str.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(str.charAt(right))) right--;

            if(str.charAt(left) != str.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }
}

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = sc.nextLine();

        Solution s = new Solution();

        System.out.println(s.isPalindrome(str));

    }
}
