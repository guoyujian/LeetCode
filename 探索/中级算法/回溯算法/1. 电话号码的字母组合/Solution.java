

import java.util.*;

/**
 * @Description 电话号码的字母组合
 * @Date 2020/6/20
 * @Created by 11599
 */
public class Solution {
    private static Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    private List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits!=null && digits.length()!=0){
            myCombinations(digits, "");
        }
        return res;
    }

    private void myCombinations(String digits, String str){
        if(digits==null || digits.length()==0){
            res.add(str);
            return ;
        }
        String val = map.get(digits.charAt(0));
        for (char c : val.toCharArray()) {
            myCombinations(digits.substring(1), str+c);
        }
    }


    public static void main(String[] args) {
        List<String> strings = new Solution().letterCombinations("23");
        for (String s : strings) {
            System.out.println(s);
        }

    }
}
