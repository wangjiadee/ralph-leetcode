package com.ralph.java;

import org.junit.Test;

/**
 * @author ralph
 * @create 2021-05-22 22:45
 */
public class TestLeetCode {
    @Test
    public void test1(){
        LeetCode leetCode = new LeetCode();
        int[] nums = {2, 7, 11, 15, 30, 45, 78};
        int target = 45;
        leetCode.twoSumWithArray(nums,target);

    }

    @Test
    public void test2(){
        LeetCode leetCode = new LeetCode();
        int[] nums = {2, 7, 11, 15, 30, 45, 78};
        int target = 45;
        leetCode.twoSumWithHashMap(nums,target);

    }

    @Test
    public void test3(){
        LeetCode leetCode = new LeetCode();
        int[] nums = {2, 7, 11, 15, 30, 45, 78};
        int target = 45;
        leetCode.twoSumWithOneHashMap(nums,target);

    }
}
