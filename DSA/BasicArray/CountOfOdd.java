package DSA.BasicArray;

class Solution{
    public int count(int arr[]){
        int n = arr.length;
        if(n == 0) return 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 != 0) cnt+=1;
        }
        return cnt;
    }
}

public class CountOfOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,9,11};

        Solution s = new Solution();

        System.out.println("The odd count is: " + s.count(arr));

    }
}
