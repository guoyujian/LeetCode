class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max_num = 0; //出现最多的次数
        int num_max = -1; //出现次数最多的数字
        for (int num : nums) {
            int tmp = map.getOrDefault(num, 0) + 1;
            if(tmp > max_num) {
                max_num = tmp;
                num_max = num;
            }
            map.put(num, tmp);
        }
        return num_max;
    }
}