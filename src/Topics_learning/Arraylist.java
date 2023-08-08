package Topics_learning;

import java.util.*;

public class Arraylist<I extends Number> {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        // Methods in array list
        arr.add(10);
        arr.set(1,33);
        arr.remove(2);
        arr.contains((5));
        arr.get(3);

        for (int i = 0; i < 10; i++) {
            arr.add(in.nextInt());
        }


        //Multi dimentional arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Initoalization  -- It is mandatory to initialize mutidimentional arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        
        //add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(j);  //-- we first go to each arraylist then add items in each arraylist through add()
            }
        }
    }
}
