public class Liner_search {
    public static void main(String[] args) {
        // Linear search is searching one by one.
        int arr[] ={1,2,3,4,4,5,6,78,678,8,8,7,978,,32,4,3,44,324};
        System.out.println(linersearch(arr,978));
        System.out.println(linersearch2(arr,978));

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
}
