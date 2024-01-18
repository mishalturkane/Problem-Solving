package leetcode.day18;

import java.util.Arrays;

public class SecondLargest {
    
    public static int secLarge(int [] arr){
        int min= Integer.MIN_VALUE;
        Arrays.sort(arr);
        if(arr[arr.length-2]==arr[arr.length-1])
            return min;
        return arr[arr.length-2];
    }
    public static int secLargeOptimised(int [] arr){
        int min=Integer.MIN_VALUE;
        int secMax;
        int max=Integer.MIN_VALUE;
        for(int x: arr){
            if(max>x){
                max=x;
                secMax=max;
            }
            if()
        }
    }

    public static void main(String[] args) {
        int [] arr={3,4,5,6,7,7,5,55,6};
        System.out.println(secLarge(arr));
    }
    
}
