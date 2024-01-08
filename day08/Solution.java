package leetcode.day08;


public class Solution {
    public static int findSum(int A[],int N) {
        //code here
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int x:A){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        return min+max;

    }
    public static String reverseWord(String str) {
        // Reverse the string str
        StringBuffer sb=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();

    }
    public static  int search(int[] nums, int target) {

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Mishal"));

    }
}
