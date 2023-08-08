package Topics_learning;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(armstrong(a));
    }

    static boolean armstrong(int n) {
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n%10;
            sum = sum + (rem*rem*rem);
            n=n/10;
        }
        return sum == original;
    }
}
