package Topics_learning;

import java.util.Arrays;
import java.util.Scanner;

public class Array_of_objects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr[] = new String[5];
        // Values are given st runtime thus it only contains objects as each element is a primitive datatype
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.next();
        }


        // Multi dimension array - array of arrays
        int marr[][] = new int[3][];  // only rows are mandatory not the columns because they could be varing.

        // input in multi-dimension array
        for(int i=0;i< marr.length;i++){
            for(int j=0;j<marr[i].length;j++){
                marr[i][j]=in.nextInt();
            }
        }

        // output in multidimensional array
        for (int i = 0; i < marr.length ; i++) {
            System.out.println(Arrays.toString(marr[i]));  // every element in the array is an array itself that can be printed
        }
    }
}
