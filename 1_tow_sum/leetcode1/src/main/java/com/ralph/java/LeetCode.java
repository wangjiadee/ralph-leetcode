package com.ralph.java;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ralph
 */
public class LeetCode {

    public int[] twoSumWithArray(int[] nums,int target){
        int[] ints = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    ints[0] = i;
                    ints[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
        return ints;
    }


    public int[] twoSumWithHashMap(int[] nums,int target){
        int[] ints = new int[2];
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>(134);
        for (int a=0;a<nums.length;a++){
            integerIntegerHashMap.put(nums[a],a);
        }
        for(int b=0;b<nums.length;b++){
            int temp = target - nums[b];
            if(integerIntegerHashMap.containsKey(temp) && b != integerIntegerHashMap.get(temp)){
                ints[0] = b;
                ints[1] = integerIntegerHashMap.get(temp);
                System.out.println(Arrays.toString(ints));
            }
        }
        return ints;
    }
    public int[] twoSumWithOneHashMap(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(134);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                //{30=3, 34=2, 38=1, 43=0}
                return new int[] {map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
            System.out.println(map);
        }
        return new int[]{1,1,1};
    }

}
