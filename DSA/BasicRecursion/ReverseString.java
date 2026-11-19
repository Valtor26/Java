package DSA.BasicRecursion;

class Solution{
    public String[] revStr(String str[]){

        return helper(str,0,str.length-1);
    }

    private String[] helper(String str[], int start, int end){
        if(start >= end) return str;

        String temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        return helper(str,start+1,end-1);
    }
}

public class ReverseString {
    public static void main(String[] args) {
        String str[] = {"a","b","h","i","s","h","e","k"};

        Solution s = new Solution();

        String ans[] = s.revStr(str);

        for(String ch : ans){
            System.out.print(ch+" ");
        }

    }
}
