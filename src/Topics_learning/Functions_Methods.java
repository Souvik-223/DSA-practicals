package Topics_learning;

import java.util.Scanner;

public class Functions_Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String sn= change(s);
        System.out.println(s);
        System.out.println(sn);

        int arr[] = {1,2,3,4,5,5,6,7,87};
        changearray(arr);
    }

    // There is nothing as a pass by reference in java it only has pass by value.
    // Only arrays are actually changed when they are changed within a function.
    static String change(String s) {
        s = "Hello world!";
        return s;
    }

    static void changearray(int[]arr){
        arr[0] = 99;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
