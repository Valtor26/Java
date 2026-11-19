package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int[] revArr(int nums[],int start,int end){
        if(start >= end) return nums;
        
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        return revArr(nums, start+1, end-1);
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();
        
        int ans[] = s.revArr(nums, 0, n-1);

        for(int el : ans){
            System.out.print(el+" ");
        }
    }
}
