

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Description 402. 移掉K位数字
 * @Date 2020/11/15
 * @Created by gyj
 */
class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<Character>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) { //注意这里是while
                deque.pollLast();
                k--;
            }
            deque.offerLast(digit);
        }

        for (int i = 0; i < k; ++i) {
            deque.pollLast();
        }

        StringBuilder ret = new StringBuilder();
        while(!deque.isEmpty() && deque.peekFirst() == '0') { //去掉前面的0
            deque.pollFirst();
        }
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            ret.append(digit);
        }
        return ret.length() == 0 ? "0" : ret.toString();
    }

    public static void main(String[] args) {
        String s = new Solution().removeKdigits("112", 1);
        System.out.println(s);
    }
}