
/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
**/
class Solution {
    public char firstUniqChar(String s) {
        int[] nums = new int[26]; // 存放每个字母出现得次数
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if(nums[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }
}