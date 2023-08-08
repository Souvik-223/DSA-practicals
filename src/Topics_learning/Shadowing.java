package Topics_learning;

public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x =45;  // Here the main global/class variable is getting shadowed.
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);  // here the class variable is getting referenced.
    }
}
