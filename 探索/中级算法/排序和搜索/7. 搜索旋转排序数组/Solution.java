
import java.util.Arrays;

/**
 * @Description 搜索旋转排序数组
 * @Date 2020/7/3
 * @Created by 11599
 */
public class Solution {
    /*
    1 找到旋转数组的偏移量
    2 重新排序数组
    3 二分法查找target
     */
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }
        int offset = arraysOffset(nums);
        int newNums[] = new int[nums.length];
        sortByOffset(newNums, nums, offset);
        int index = Arrays.binarySearch(newNums, target); //二分查找
        return  index < 0 ? -1 : (nums.length + index - offset) % nums.length ; //注意这里返回的是原数组的index，所以需要做一步运算
    }

    /*查找数组的偏移量 */
    private int arraysOffset(int[] nums){
        int offset = 0;
        if(nums[0] > nums[nums.length-1]) {
            offset++;
            for(int i=nums.length-1; i>0 && nums[i] > nums[i-1]; i--){
                offset++;
            }
        }
        return offset;
    }

    /* 根据偏移量，将数组拷贝到新的数组中 */
    private void sortByOffset(int[] newNums, int[] nums, int offset){
        if(nums.length != newNums.length || nums.length == 1){
            return ;
        }
        for (int i = 0; i < offset; i++) {
            newNums[i] = nums[nums.length-offset+i];
        }
        for (int i = offset; i < newNums.length; i++) {
            newNums[i] = nums[i-offset];
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,3};
//        int newNums[] = new int[nums.length];
//        System.out.println(new Solution().arraysOffset(nums));
//        new Solution().sortByOffset(newNums, nums, 3);
//        for (int num : newNums) {
//            System.out.println(num);
//        }
//        System.out.println(Arrays.binarySearch(nums, 0));
        System.out.println(new Solution().search(nums, 0));
    }

}
