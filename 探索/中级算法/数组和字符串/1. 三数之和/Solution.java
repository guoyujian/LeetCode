

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {
    /** 抄的
     * 思路
     * 1.先把数组排序
     * 2.从小到大遍历这个数组，每次取一个元素，将这个元素的相反数设为target
     * 3.在每次遍历中，使用双指针对当前元素的后面的所有元素进行处理，找到两个元素的和为target，这样，三个元素的和就是 0
     * 4.双指针的具体处理方式为：头尾各一个指针，每次判断两个指针所指的元素的和与target的大小，如果和小了，左指针右移；如果和大了，右指针左移，直到两个指针相遇
     * 注意
     * 在第 2 条中，遍历数组的次数不是整个数组的长度，只需要遍历至倒数第 3 个元素，因为是考察 3 个元素的和
     * 因为不能有重复的结果，所以前后两次遍历取的元素如果相等，要采取跳过的操作
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length<3){
            return lists;
        }
        Arrays.sort(nums); // 排序

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            } // 避免相同的结果集
            int target = -nums[i]; // 取相反数
            int j = i+1; // 为什么从i+1开始遍历，而不是0
            int k = nums.length-1; // 双指针
            while(j<k){
                if(nums[j] + nums[k] == target){
                    lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])  j++; // 避免相同的结果集
                    while(j<k && nums[k] == nums[k+1])  k--; // 避免相同的结果集
                } else if(nums[j] + nums[k] < target){
                    j++;
                } else{
                    k--;
                }
            }
        }
        return lists;
    }


    /*
        该方法超时
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i] + nums[j] +nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                            }
                        }); // 排序后在放入set集合。使得set集合中的元素不相同
                        set.add(list);
                    }
                }
            }
        }
        lists.addAll(set);
        return lists;
    }






    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = new Solution().threeSum(nums);
        for(List<Integer> list : lists){
            String str = "";
            for(Integer num : list){
                str += num +",";
            }
            System.out.println(str);
        }
    }
}
