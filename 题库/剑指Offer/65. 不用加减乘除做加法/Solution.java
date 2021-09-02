class Solution {
    public int add(int a, int b) { // 位运算，抄的答案
        while(b != 0) { //当进位为0时结束
            int c = (a & b) << 1; //进位
            a ^= b; //非进位和（通过异或运算得到）
            b = c; // 令b为进位，
        }
        return a;
    }
}