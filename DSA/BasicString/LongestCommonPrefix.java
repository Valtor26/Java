package DSA.BasicString;

import java.util.Scanner;

class Solution{
    public String lcp(String str[]){
        if(str.length == 0) return "";

        String prefix = str[0];

        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length() == 0) return "";
            }
        }
        return prefix;
    }
}

public class LongestCommonPrefix {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of strings: ");

            int n = sc.nextInt();
            sc.nextLine();

            String str[] = new String[n];

            for(int i=0;i<n;i++){
                str[i] = sc.nextLine(); 
            }

            Solution s = new Solution();

            System.out.println(s.lcp(str));

            sc.close();
       }
}
