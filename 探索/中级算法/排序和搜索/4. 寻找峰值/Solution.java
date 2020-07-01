

/**
 * @Description 寻找峰值
 * @Date 2020/7/1
 * @Created by 11599
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]) { // 当前值比右边的值要大
                return i;
            }
        }
        return nums.length-1;
    } // 官方要求O(logN)的时间复杂度，但是本解法的时间复杂度为O(N)。但是也通过了

    public static void main(String[] args) {
        
    }
}
