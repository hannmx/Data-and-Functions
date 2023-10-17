package org.hannmx;

public class ArrayUtils {   //реализация всех методов массива
    public static int countEvent(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findDifference(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        return max - min;
    }

    public static boolean hasZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i+1] == 0) {
                return true;
            }
        }
        return false;
    }
}
