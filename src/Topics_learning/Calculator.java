package Topics_learning;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        //Take input from the user till presses x
        while(true){
            char op = input.next().trim().charAt(0);
            if(op =='x' || op == 'X'){
                break;
            }
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            if (op=='+' ||op=='-' ||op=='/'||op=='*' || op=='%'){
                switch (op){
                    case '+' -> ans = num1 + num2;
                    case '-' -> ans = num1 - num2;
                    case '/' -> ans = num1 / num2;
                    case '*' -> ans = num1 * num2;
                    case '%' -> ans = num1 % num2;
                }

            }
            System.out.println(ans);
        }
    }
}
