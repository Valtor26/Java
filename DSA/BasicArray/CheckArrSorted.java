package DSA.BasicArray;

class Solution{
    public Boolean isSorted(int arr[]){
        int n = arr.length;

        if(n == 0 || n == 1) return true;
        boolean flag = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]) return false;
        }

        return flag;
    }
}

public class CheckArrSorted {
    public static void main(String[] args) {
        int arr[] = {9,1,2,3};

        Solution s = new Solution();
        System.out.println((s.isSorted(arr)) ? "Sorted" : "Unsorted");
    }
}
