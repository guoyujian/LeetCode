

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();

        for(String str : strs){
            if(!lists.isEmpty()){
                boolean hasFindAnagram = false;
                for (List<String> list : lists) {
                    if(isAnagram(list.get(0), str)){
                        list.add(str);
                        hasFindAnagram = true;
                        break;
                    }
                }
                if(!hasFindAnagram){
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    lists.add(list);
                }
            } else{
                List<String> list = new ArrayList<>();
                list.add(str);
                lists.add(list);
            }
        }
        return lists;
    } // 虽然通过了，但是时间效率还是太慢。

    private boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int nums1[] = new int[26]; //已经被java自动初始化为0
        int nums2[] = new int[26];
        for(Character ch: str1.toCharArray()){
            nums1[ch-'a'] ++;
        }
        for(Character ch: str2.toCharArray()){
            nums2[ch-'a'] ++;
        }

        for (int i = 0; i < 26; i++) {
            if(nums1[i] != nums2[i]){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        int nums1[] = new int[26];
        for (Integer num: nums1) {
            System.out.println(num);
        }
    }
}
