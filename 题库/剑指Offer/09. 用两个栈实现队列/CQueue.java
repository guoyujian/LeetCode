

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Description TODO
 * @Date 2021/7/21
 * @Created by 11599
 */
class CQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        if(s1.isEmpty()) {
            return -1;
        }
        //s2 is empty && s1 is not empty
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */