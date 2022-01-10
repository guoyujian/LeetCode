
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        // 注意，right 是开区间，所以再加一
        int right = 1000000000 + 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(f(piles, mid) <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 计算 当吃香蕉的速度为K，吃完piles所有的香蕉需要的小时
     * @return
     */
    private int f(int[] piles, int K) {
        int hour = 0;
        for (int pile : piles) {
            hour += pile / K;
            if(pile % K != 0) {
                hour ++;
            }
        }
        return hour;
    }
}