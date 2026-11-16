package DSA.BasicString;

import java.util.Scanner;

class Solution{
    public String findLargeOddNumb(String str){
        str = str.replaceFirst("^0+", "");
        int n = str.length();
        if(n == 0) return "";
        for(int i=n-1;i>=0;i--){
            int digit = str.charAt(i) - '0';

            if(digit % 2 != 0) return str.substring(0, i+1);
        }

        return "";
    }
}

public class LargestOddNumStr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = sc.nextLine();

        Solution s = new Solution();

        System.out.println(s.findLargeOddNumb(str));
    }
}