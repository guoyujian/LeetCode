


import java.util.ArrayList;

public class MinStack {
    private int min, top;
    private ArrayList<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        top = -1;
    }

    public void push(int x) { // 假设内存不会溢出
        stack.add(x);
        top++;
        if(top == 0){
            min = x;
        } else if(x < min){
            min = x;
        }
    }

    public void pop() { //需要判空
        if(top < 0){
            return ;
        }
        int popNum = stack.remove(top--);
        if(top < 0){
            //栈为空
            min = 0;
        }
        if(popNum == min){ //如果出栈元素是最小元素，则重新查找最小元素
            int tmp = stack.get(0);
            for(int i=0; i<=top; i++){
                if(tmp > stack.get(i)){
                    tmp = stack.get(i);
                }
            }
            min = tmp;
        }
    }

    public int top() {
        return stack.get(top);
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   //返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      //返回 0.
        System.out.println(minStack.getMin());   //返回 -2.

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */


