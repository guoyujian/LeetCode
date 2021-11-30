


/**
 * 1094. 拼车
 */
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] nums = new int[1001]; //题目规定车站数最多1000，所以这里数组长度为1001
        Difference diff = new Difference(nums);
        for (int[] trip : trips) {
            diff.increment(trip[1], trip[2]-1, trip[0]);
        }
        int[] result = diff.result();

        for (int i = 0; i < result.length; i++) {
            if(capacity < result[i]) {
                return false;
            }
        }
        return true;
    }
}

class Difference {
    private int[] diff; // 定义差分数组
    public Difference(int[] nums) {
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i-1];
        }
    }
    //在数组上做运算
    public void increment(int i, int j, int val) {
        diff[i] += val;
        if(j+1 < diff.length) {
            diff[j+1] -= val;
        }
    }

    //返回真实的数组
    public int[] result() {
        //根据差分数组还原真实的数组
        int[] nums = new int[diff.length];
        nums[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            nums[i] = nums[i-1] + diff[i];
        }
        return nums;
    }
}