

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 15 == 0){ //既是3又是5的倍数
                list.add("FizzBuzz");
            } else if(i % 5 == 0){
                list.add("Buzz");
            } else if(i % 3 == 0){
                list.add("Fizz");
            } else{
                list.add(i+"");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.fizzBuzz(15);
        for(String str : list){
            System.out.println(str);
        }
    }
}
