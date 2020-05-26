
import java.util.Random;

public class Solution {
    private int[] array;
    private int[] original;

    Random random = new Random();
    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    private void swap(int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    private int getRand(int min ,int max){
        return random.nextInt(max - min) + min;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0; i<array.length; i++){
            swap(i , getRand(i, array.length));
        }
        return array;
    }
}// 基本是抄的。。
//shuffle思想：遍历数组，索引指向i，生成随机数（i到nums.length），将该随机数指向的元素与i指向的元素交换。

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */