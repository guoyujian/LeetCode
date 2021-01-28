
/**
 * @Description 724. 寻找数组的中心索引
 * @Date 2021/1/28
 * @Created by gyj
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int front = 0, rear = 0; // front是前半部分的和，rear是后半部分的和
        for (int i = 1; i < nums.length; i++) {
            //计算rear
            rear += nums[i];
        }
        int i = 0;
        while(i < nums.length) {
            if(rear == front) {
                return i;
            }
            front += nums[i];
            if(i == nums.length - 1) {
                rear -= nums[i];
                i++;
                if(rear == front) {
                    return i;
                }
            } else {
                rear -= nums[++i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Solution().pivotIndex(nums));
    }
}