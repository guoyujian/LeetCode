

/**
 * @Description 颜色分类
 * @Date 2020/6/26
 * @Created by 11599
 */
public class Solution {
    public void sortColors1(int[] nums) { // 这种做法太赖了
        if(nums==null || nums.length==0){
            return ;
        }
        int count0=0, count1=0, count2=0;
        for (int num : nums) {
            if(num==0){
                count0++;
            }
            if(num==1){
                count1++;
            }
            if(num==2){
                count2++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i<count0){
                nums[i] = 0;
            } else if(i<count0+count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }

    }

    public void sortColors(int[] nums) { //另一种做法
        int p0=0, curr=0, p2 = nums.length-1;
        while(curr<=p2){
            int tmp;
            if(nums[curr] == 0){ // 注意nums[curr]等于0和等于2时的逻辑并不完全相同。
                tmp = nums[curr];
                nums[curr++] = nums[p0];
                nums[p0++] = tmp;
            } else if(nums[curr] == 2){
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            } else{
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        new Solution().sortColors(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

}
