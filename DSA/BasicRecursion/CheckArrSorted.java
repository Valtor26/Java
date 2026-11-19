package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public boolean isArrSorted(int nums[],int i){
        if(i == nums.length - 1) return true;

        if(nums[i] > nums[i+1]) return false;

        return isArrSorted(nums, i+1);
    }
}

public class CheckArrSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.isArrSorted(nums, 0) ? "Sorted" : "Unsorted");
    }
}
