package DSA.BasicHashing;

import java.util.*;

class Solution{
    public int findSumOfFreq(int nums[]){
        if(nums.length == 0) return 0;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int val : nums){
            if(!freq.containsKey(val)){
                freq.put(val, 1);
            }
            else{
                freq.put(val, freq.get(val) + 1);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            maxFreq = Math.max(maxFreq,entry.getValue());
            minFreq = Math.min(minFreq, entry.getValue());
        }

        return maxFreq + minFreq;
    }
}

public class SumOfLowHighFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Solution s = new Solution();

        System.out.println(s.findSumOfFreq(nums));
        sc.close();
    }
}
