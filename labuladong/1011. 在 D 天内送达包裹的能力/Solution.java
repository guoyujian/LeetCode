

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //船的最小载重weights中的最大值；船的最大载重weights之和；
        int left = 0, right = 1;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while(left < right) {
            int mid = left + (right - left) / 2;
            if(f(weights, mid) <= days) {
                right = mid;
            } else if(f(weights, mid) > days) {
                left = mid + 1;
            }
        }
        return left;
    }

    /**
     * 根据当运载力为x时，需要的搬运的天数
     * @param weights
     * @param x
     * @return
     */
    private int f(int[] weights, int x) {
        int days = 0;
        for (int i = 0; i < weights.length; ) {
            int cap = x;
            while(i < weights.length) {
                if(weights[i] > cap) {
                    break;
                } else {
                    cap -= weights[i];
                    i ++;
                }
            }
            days ++;
        }
        return days;
    }
}