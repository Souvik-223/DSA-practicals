package Leetcode_Questions;
public class leetcode_1295 {
    public static void main(String[] args) {
        //  Question -  Find Numbers with Even Number of Digits
        //  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count=0;
        int even=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
            count = 0;
        }
        return even;
    }
}
