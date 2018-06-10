package com.ldu.bevishe.leetcode;
//两数之和
import java.util.Scanner;

import static com.ldu.bevishe.util.Print.*;
public class Solution1 {

    public  int [] twoSum(int[] nums,int target){
        int[] sum = null;
        int len = nums.length;
        boolean flag = false;
        for(int i=0;i<len-1;i++) {
            for (int j = i + 1; j < len; j++)
                if (target == (nums[i] + nums[j])) {
                    sum[0] = nums[i];
                    sum[1] = nums[j];
                    flag = true;
                    break;
                }
            if (flag)
                break;
        }
        return sum;
    }

}
