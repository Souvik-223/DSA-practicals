import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        // This is the newest syntax for switch case statements in java
        switch (fruit){
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Orange" -> System.out.println("A round orange fruit");
            default -> System.out.println("Enter a valid fruit");
        }

        int day = input.nextInt();
        //It means the same will be applied for all the cases
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay");   //Change into the old style switch case to see the break statements
            case 6, 7 -> System.out.println("Weekend");
        }

        //Nested switch case
        int dept = input.nextInt();
        switch (day) {
            case 1, 2, 3, 5 -> System.out.println("WeekDay");
            case 4 -> {
                switch (dept){
                    case 9 -> System.out.println("Special Holiday");
                }
            }
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
