package Topics_learning;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float f = input.nextInt();
//        System.out.println(f);
//
//        int a = 24;
//        float c = (int)(a); //Type casting of float variables in
//
//        int b = 257;
//        byte v = (byte)(b);  // 257 % 256 = 1   (maximum value of byte is 256)
//
//        // byte auto manupulation
//        byte d = 10;
//        d=d*26; // can't do because when multiplying byte is automatically cast into int as the value gets out of the range of byte

        byte b = 42;
        char c ='k';
        int a = 3;
        short s = 35;
        float j = 78.65f;
        double d =4322345.631232131;
        double result = (j*b)+(c*a)-(d*s);
        System.out.println(result);   // It will automatically typecaste everything to double since it is the largest.
    }
}
