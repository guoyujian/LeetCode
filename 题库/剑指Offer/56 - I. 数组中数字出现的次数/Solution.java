class Solution {
    public int[] singleNumbers(int[] nums) { //抄的题解
        int n = 0;
        for (int num : nums) {
            n ^= num; // 取得数组的异或和，相同的数字异或为0，所以最后的异或和n为x⊕y（假设xy为所求）
        }
        //从右向左获得n为1的位，即x和y不同的位
        int m = 1;
        while((n & m) == 0) {
            m <<= 1;
        }
        //将nums分为两组，区分x和y，最后两组nums分别异或得到x和y
        int x = 0, y = 0;
        for (int num : nums) {
            if((num & m)  == 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x, y};
    }
}