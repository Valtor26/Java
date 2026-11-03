package DSA.Patterns;

import java.util.Scanner;

public class Pattern11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        int dig = 0;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                    dig = 1;
                }
            else dig = 0;
            for(int j=0;j<=i;j++){
                System.out.print(dig+" ");
                dig = (dig == 0) ? 1 : 0;
            }
            System.out.println();
        }
    }
}