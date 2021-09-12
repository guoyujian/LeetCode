
import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while(i < pushed.length) {
            if(!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
                continue;
            }
            stack.push(pushed[i++]);
            if(stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        while(j < popped.length) {
            if(popped[j] == stack.peek()) {
                stack.pop();
                j++;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] poped = {4,3,5,1,2};
        System.out.println(new Solution().validateStackSequences(pushed, poped));
    }
}