package DSA.BasicString;


class Solution{
    public String[] revString(String str[]){
        int n = str.length;
        if(n <= 1) return str;

        for(int i=0;i<n/2;i++){
            String temp = str[i];
            str[i] = str[n-i-1];
            str[n-i-1] = temp;
        }
        return str;
    }
}

public class ReverseStringArr {
    public static void main(String[] args) {
        String str[] = {"r","a","c","e","c","a","R"};

        Solution s = new Solution();

        String ans[] = s.revString(str);

        for(String ch : ans){
            System.out.print(ch + " ");
        }
    }
}
