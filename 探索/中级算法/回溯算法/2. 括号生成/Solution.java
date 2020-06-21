

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description 括号生成
 * @Date 2020/6/21
 * @Created by 11599
 */
public class Solution {
    private Set<String> set = new HashSet<>();

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n<0){
            return res;
        }
        helper(n ,"");
        res.addAll(set);
        return res;
    }

    private void helper(int n, String str){
        if(n == 0){
            set.add(str);
            return ;
        }
        for(int i=0; i<str.length()+1; i++){
            helper(n-1, str.substring(0,i)+"()"+str.substring(i));
        }

    }

    public static void main(String[] args) {
        List<String> strings = new Solution().generateParenthesis(3);
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
