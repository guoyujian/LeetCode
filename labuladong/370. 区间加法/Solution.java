
/**
 * 370 区间加法
 * 本题为plus会员题，详见《题目.md》
 */
class Solution {
    int[] getModifiedArray(int length, int[][] updates) {
        int[] nums = new int[length];
        Difference diff = new Difference(nums);
        for (int i = 0; i < updates.length; i++) {
            int[] item = updates[i];
            diff.increment(item[0], item[1], item[2]);
        }
        return diff.result();
    }

    public static void main(String[] args) {
        int[][] updates = {{1,3,2},{2,4,3},{0,2,-2}};
        int length = 5;
        int[] modifiedArray = new Solution().getModifiedArray(length, updates);
        for (int num : modifiedArray) {
            System.out.println(num);
        }
    
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