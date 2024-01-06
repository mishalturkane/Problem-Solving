package leetcode.day05;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> entry=new HashSet<>();
        for(int i=0;i< nums.length; i++){
            if(entry.contains(nums[i]))
                return true;
            entry.add(nums[i]);
        }
        return false;

    }



    public static void main(String[] args) {

    }
}