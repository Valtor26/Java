package DSA.BasicString;

import java.util.Scanner;

class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int freq[] = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a'] += 1;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i) - 'a'] -= 1;
        }

        for(int i=0;i<26;i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal: ");
        String goal = sc.nextLine();

        Solution sol = new Solution();

        System.out.println(sol.isAnagram(s, goal) ? "Yes" : "No");
    }
}
