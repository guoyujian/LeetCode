
/**
 * @Description
 * @Date 2021/8/24
 * @Created by 11599
 **/
class Solution {
    public int[] exchange(int[] nums) {
        if(nums == null || nums.length < 2) {
            return nums;
        }
        int head = 0, rear = nums.length - 1;
        do{
            while(head < nums.length && nums[head] % 2 == 1)    head ++;
            while(rear > -1 && nums[rear] % 2 == 0)    rear --;
            if(rear > -1 && head < nums.length && head < rear) {
                //swap
                int tmp = nums[head];
                nums[head] = nums[rear];
                nums[rear] = tmp;
            }
        } while(rear > -1 && head < nums.length && head < rear);
        return nums;
    }
}