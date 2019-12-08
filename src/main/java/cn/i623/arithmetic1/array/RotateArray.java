package cn.i623.arithmetic1.array;

public class RotateArray {
    /**
     * RotateArray给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 0.1.2
     */
    public static void rotate(int[] nums, int k) {
        while (k > 0) {
            int last = nums[nums.length-1];

            for (int i = nums.length-1; i > 0; i--) {
                nums[i]=nums[i-1];
            }
            nums[0] = last;
            k--;
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate(nums,3);
    }
}

