

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description TODO
 * @Date 2021/9/12
 * @Created by 11599
 */
class MaxQueue {
    private Queue<Integer> queue;
    private Deque<Integer> deque; //双端队列，辅助队列，单调队列，队首元素即为最大
    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.isEmpty() ?  -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value) {
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if(queue.isEmpty()) {
            return -1;
        }
        int res = queue.poll();
        if(res == deque.peekFirst()) {
            deque.pollFirst();
        }
        return res;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */