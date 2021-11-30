

/**
 * 1109. 航班预订统计
 */
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        Difference diff = new Difference(nums);

        for (int[] booking : bookings) {
            diff.increment(booking[0]-1, booking[1]-1, booking[2]);
        }
        return diff.result();
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