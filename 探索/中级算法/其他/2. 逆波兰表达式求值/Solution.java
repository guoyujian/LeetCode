

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Description 逆波兰表达式求值：未验证
 * @Date 2020/7/21
 * @Created by 11599
 */
public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if("+".equals(token)) {
                String ele1 = stack.pop();
                String ele2 = stack.pop();
                String ele = String.valueOf(Integer.parseInt(ele2) + Integer.parseInt(ele1));
                stack.push(ele);
            }
            else if("-".equals(token)) {
                String ele1 = stack.pop();
                String ele2 = stack.pop();
                String ele = String.valueOf(Integer.parseInt(ele2) - Integer.parseInt(ele1));
                stack.push(ele);
            }
            else if("*".equals(token)) {
                String ele1 = stack.pop();
                String ele2 = stack.pop();
                String ele = String.valueOf(Integer.parseInt(ele2) * Integer.parseInt(ele1));
                stack.push(ele);
            }
            else if("/".equals(token)) {
                String ele1 = stack.pop();
                String ele2 = stack.pop();
                String ele = String.valueOf(Integer.parseInt(ele2) / Integer.parseInt(ele1));
                stack.push(ele);
            }
            else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","-3","*"};
        System.out.println(new Solution().evalRPN(tokens));
    }
}
