public class Array {
    public static void main(String args[]){

        int testArr[] = {10, 20, 30, 40, 50}; // create an array of size 5 on stack memory

        for(int i=0;i<testArr.length;i++){
            System.out.println(testArr[i]);
        }

        int arr[] = new int[5]; // create an array of size 5 on heap memory
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        int testTwoArr[][] = {{10, 20, 30}, {40, 50, 60}}; // create a 2D array of size 2x3 on stack memory

        int twoArr[][] = new int[2][3]; // create a 2D array of size 2x3 on heap memory
        twoArr[0][0] = 10;
        twoArr[0][1] = 20;
        twoArr[0][2] = 30;
        twoArr[1][0] = 40;
        twoArr[1][1] = 50;        
        twoArr[1][2] = 60;  

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(twoArr[i][j]);
            }
        }
    }
}
