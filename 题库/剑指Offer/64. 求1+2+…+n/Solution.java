class Solution {
    public int sumNums(int n) {
        //利用&&的短路效应
        //https://leetcode-cn.com/problems/qiu-12n-lcof/solution/mian-shi-ti-64-qiu-1-2-nluo-ji-fu-duan-lu-qing-xi-/
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
