package com.binarysearch;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21,34,55,89 前两个数字相加等于后一个数字
        //用for循环解题填入数组
        int[] nums = new int[20];
        nums[0] = 0;
        nums[1] = 1;
        //从第三个数字开始循环写入数组
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
            if (nums[i] >=1000) {
                nums[i] = 0;
                break;
            }
            System.out.println(nums[i]);


        }
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }
}
