class Solution {
    //超时，但是思路应该没问题。
    private Map<String, Integer> memo;
    public int superEggDrop(int k, int n) {
        //key：存储K,N，value存储当鸡蛋数量为K，楼层为N时，求得f的最小操作数
        memo = new HashMap<>();
        return dp(k, n);
    }
    private int dp(int k, int n) {
        if(k == 1) {
            return n; //如果只有一个鸡蛋，那就只能挨个楼层扔
        }
        if(n == 0) {
            return 0; // 如果没有楼层，那就不需要扔鸡蛋
        }
        String key = "(" + k + "," + n + ")";
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++) {
            res = Math.min(
                res,
                Math.max(
                    dp(k-1, i-1),//蛋碎了
                    dp(k, n-i)
                ) + 1
            );
        }
        //计入备忘录
        memo.put(key, res);
        return res;
    }
}