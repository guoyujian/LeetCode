
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0; //利用快慢指针
        while(fast < nums.length) {
            if(nums[slow] != nums[fast]) {
                slow ++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    public static void main(String[] args) {

    }
}