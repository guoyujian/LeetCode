

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/4/28 16:34
 * @Created by 11599
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }
        int min_len = strs[0].length(); // 记录字符数组中最短的长度
        for(int i=0; i<strs.length; i++){
            if(min_len>strs[i].length()){
                min_len = strs[i].length();
            }
        }
        if(min_len == 0){
            return "";
        }
        int max_public_index = 0; // 记录最大公共的index
        char temp;
        boolean flag = true;
        for(max_public_index = 0; max_public_index<min_len && flag; max_public_index++){
            temp = strs[0].charAt(max_public_index);
            for(int i=1; i<strs.length; i++){
                if(temp != strs[i].charAt(max_public_index)){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            return strs[0].substring(0, max_public_index);
        } else {
            return strs[0].substring(0, max_public_index-1);
        }

    }

    public static void main(String[] args) {
        String strs[] = {"fl","fl"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }

}
