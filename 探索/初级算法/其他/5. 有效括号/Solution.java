

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Classname Solution
 * @Description 
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }
            if(ch == '}'){
                if(stack.empty() || !(stack.pop().equals('{'))){
                    return false;
                }
            }
            if(ch == ']'){
                if(stack.empty() || !(stack.pop().equals('['))){
                    return false;
                }
            }
            if(ch == ')'){
                if(stack.empty() || !(stack.pop().equals('('))){
                    return false;
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;
    }




    public static void main(String[] args) {

        String str = "";
        System.out.println(new Solution().isValid(str));
    }
}
