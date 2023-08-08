package Topics_learning;

import java.util.Arrays;

public class Variable_length_arguments {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,3,8,9);
        fun(4,6,"souvik","kunal","Dhiraj","karan");
        System.out.println();
    }

    // This is variable length arguments
    static void fun(int...v){
        System.out.println(v);
    }

    // Multiple values in variable length arguments
    static void fun(int a, int b, String ...s){
        System.out.println(a+b);
        System.out.println(Arrays.toString(s));
    }

    // Function Overloading -> Same function in written again and again to provide flexibility to a function
    static void hero(int age){}
    static void hero(String name){}
    static void hero(int age, String name){}
}
