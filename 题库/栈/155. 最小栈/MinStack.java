
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description TODO
 * @Date 2021/8/11
 * @Created by 11599
 */
class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    /** initialize your data structure here. */
    public MinStack() {
        s1 = new Stack<>(); //数据栈
        s2 = new Stack<>(); //辅助栈：保存数据栈的非递增序列，栈顶元素就是最小元素
    }

    public void push(int x) {
        s1.push(x);
        if(s2.isEmpty() || s2.peek() >= x) {
            s2.push(x);
        }
    }

    public void pop() {
        int pop_ele = s1.pop();
        if(pop_ele == s2.peek()) { //如果弹出的元素和辅助栈栈顶（最小值）是相同的，则辅助栈也应弹出栈顶元素
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */