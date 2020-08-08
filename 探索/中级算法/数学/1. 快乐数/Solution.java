
/**
 * @Description 快乐数
 * @TODO: 未验证是否通过测试
 * @Date 2020/7/11
 * @Created by 11599
 */
public class Solution {
    //根据快乐数的定义和"所有非快乐数都会进入4，16……4的循环"来判断
    public boolean isHappy(int n) {
        if(n <= 0) {
            return false;
        }
        while(true) {
            if(n == 1) {
                return true;
            }
            if(n == 4) {
                return false;
            }
            int tmp = 0;
            while(n != 0) {
                int num = n % 10;
                tmp += num * num;
                n = n / 10;
            }
            n = tmp;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(19));
        System.out.println(new Solution().isHappy(5));
        System.out.println(new Solution().isHappy(7));

    }

}
