package cn.i623.arithmetic1.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RepeatCheak {
    //方法一：排序，相邻有相同则返回ture
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);//直接在原数组上进行的
        int now;
        int last=(nums.length==0)?0:nums[0] - 1;

        for (int num : nums) {
            now = num;
            if (now == last) return true;
            last = now;
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        //方法二：遍历，出现第二次即可停止
        boolean hasRepeat = false;
        label:
        for (int i = 0; i < nums.length - 1; i++) {//for each循环会直接取出数组中的每个值
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    hasRepeat = true;
                    break label;
                }
            }
        }
        return hasRepeat;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{};
        containsDuplicate(nums);
    }
}
