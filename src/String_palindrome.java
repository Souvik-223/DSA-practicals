import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String newstring = "";
        int n =s.length();
        for (int i = 0; i < n; i++) {
            newstring = newstring + s.charAt(i);
        }
        if (newstring==s){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a plaindrome");
        }
    }
}
