import java.util.*;

/**
 * @Description 比较含退格的字符串
 * @Date 2020/10/19
 * @Created by gyj
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : S.toCharArray()) {
            if(ch != '#') {
                stack1.push(ch);
            } else {
                if(!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }

        for (char ch : T.toCharArray()) {
            if(ch != '#') {
                stack2.push(ch);
            } else {
                if(!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }
        if(stack1.size() != stack2.size()) {
            return false;
        }
        for (int i = 0; i < stack1.size(); i++) {
            if(stack1.get(i) != stack2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

}

