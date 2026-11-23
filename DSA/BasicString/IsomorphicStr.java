package DSA.BasicString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{
    public boolean isIsomorphic(String a, String b){
        if(a.length() != b.length()) return false;

        Map<Character,Character> forward =  new HashMap<>();
        Map<Character,Character> reverse = new HashMap<>();
        int n = a.length();

        for(int i=0;i<n;i++){
            char source = a.charAt(i);
            char target = b.charAt(i);

            if(forward.containsKey(source) && forward.get(source) != target) return false;

            if(reverse.containsKey(target) && reverse.get(target) != source) return false;

            forward.put(source, target);
            reverse.put(target, source);
        }
        return true;
    }
}

public class IsomorphicStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        Solution s = new Solution();

        System.out.println(s.isIsomorphic(a, b) ? "True" : "No");

    }
}