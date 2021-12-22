class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while(fast < nums.length) { // 先把所有非0元素移动到前面。
            if(nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }
        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}