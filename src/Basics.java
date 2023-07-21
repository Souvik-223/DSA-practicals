import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.in refers to the keyboard input
        System.out.println(input.nextInt());

        //Primitive Datatype
        int i = input.nextInt();
        char letter = 'c';
        float marks = input.nextFloat();  //f is added becuse by default any decimal value is double
        double largedecimalnumbers = 4782974994.232939283;
        long largeinteger = 237739739273937213L;  //L is added because by default any numeric value is int
        boolean check = true;

        //Non-Primitive Datatype
        String s = input.nextLine();
        int name[] = new int[10];
    }
}
