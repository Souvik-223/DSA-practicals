import java.util.Scanner;

public class Conditionals_loops {
    public static void main(String[] args) {

        //Uses Math class to find the largest values
        int max = Math.max(44,Math.max(32,54));
//
        Scanner input = new Scanner(System.in);
        char c = input.next().trim().charAt(0);  // takes the next word and finds the character at 0th index of the array.


        // Fibonachi Series
        int a = 0;
        int b = 1;
        int nin = input.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i=1;i<=nin-2;i++){
            int k = a+b;
            System.out.print(k + " ");
            a=b;
            b=k;
        }
        System.out.println();
        System.out.println("So the final value of the "+nin+"th element is:- "+b);


        //Remove all the duplicate number in a given long number
         int n = 611616796;
         int count = 0;
         while(n>0){
             int rem = n%10;
             if(rem == 6){
                 count++;
             }
             n = n /10;
         }
        System.out.println(count);


        //Reverse a given number
        int n2 = 23579;
        int nextra=0;
        while (n2>0){
            nextra = nextra*10 + (n2%10);
            n2=n2/10;
        }
        System.out.println(nextra);

    }
}
