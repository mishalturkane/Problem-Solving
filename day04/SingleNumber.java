package leetcode.day04;

public class SingleNumber {
    public static  int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;

    }
    public static void main(String[] args) {
            int [] arr={2,2,1};
        System.out.println(  singleNumber(arr));
    }
}
