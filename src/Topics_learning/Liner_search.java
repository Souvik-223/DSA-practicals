package Topics_learning;

public class Liner_search {
    public static void main(String[] args) {
        // Linear search is searching one by one.
        int arr[] ={1,2,3,4,4,5,6,78,678,8,8,7,978,32,4,3,44,324};
        String str = "Souvik chakraborty";
        System.out.println(linersearch(arr,978));
        System.out.println(linersearch2(arr,978));

        //searching in 2d array
        int [][] arr2d = {{23,55,7,34},{1,2,3},{34,66,22,90,87}};
        searching2darray(arr2d,arr2d.length,5,87);

    }

    //Searching through index
    static int linersearch(int[] arr, int target){
        if (arr.length == 0 ){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //Searching through boolean
    static boolean linersearch2(int[] arr, int target){
        if (arr.length == 0 ){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    // Searching in Strings
    static boolean linearsearchstring(String s, char target){
        if (s.length() == 0){
            return false;
        }
        // Using modified for loop
        for (char ch: s.toCharArray()) {
            if (ch == target){
                return true;
            }
        }
        return false;
    }


    static int[] searching2darray(int[][]arr,int row,int column,int target){
        //using for each loop
        for (int[] elem : arr) {
            for (int n: elem) {
                if (n == target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
