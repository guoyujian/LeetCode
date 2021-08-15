class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low < high) {
            int pivot = low + (high - low) / 2;
            if(nums[pivot] > nums[high]) {
                low = pivot + 1;
            } else if(nums[pivot] < nums[high]) {
                high = pivot;
            } else {
                high --;
            }
        }
        return nums[low];
    }
}