package DSA.BasicArray;

class Solution{
    public int sumOfArray(int arr[]){
        int sum = 0;
        int n = arr.length;
        if(n == 0) return 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}

public class SumOfArr {
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,5,1};

        Solution s = new Solution();

        System.out.println("The sum of array elem is: " + s.sumOfArray(arr));
    }
}
