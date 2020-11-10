


/**
 * @Description 31. 下一个排列
 * @Date 2020/11/10
 * @Created by gyj
 */

/**
 * 根据该思路抄的：
 * 先找出最大的索引 k 满足 nums[k] < nums[k+1]，如果不存在，就翻转整个数组；
 * 再找出另一个最大索引 l 满足 nums[l] > nums[k]；
 * 交换 nums[l] 和 nums[k]；
 * 最后翻转 nums[k+1:]。
 * from Wiki
 */

public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int firstIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstIndex = i;
                break;
            }
        }
        if (firstIndex == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int secondIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[firstIndex]) {
                secondIndex = i;
                break;
            }
        }
        swap(nums, firstIndex, secondIndex);
        reverse(nums, firstIndex + 1, nums.length - 1);
        return;

    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int i1) {
        int tmp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = tmp;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution().nextPermutation(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }


}