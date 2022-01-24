class Solution {
    private Map<String, Boolean> memo = new HashMap<>();
    public boolean isMatch(String s, String p) {
        return dp(s, 0, p, 0);
    }


    private boolean dp(String s, int i, String p, int j) {
        int m = s.length();
        int n = p.length();
        //base case
        if(j == n) {
            return m == i;
        }
        if(m == i) {
            if((n-j) % 2 != 0) {
                return false;
            }
            for(; j+1 < n; j += 2) {
                if(p.charAt(j+1) != '*') {
                    return false;
                }
            }
            return true;
        }
        boolean res = false;
        String key = i + "," + j;
        if(memo.containsKey(key))   return memo.get(key);
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
            if(j + 1 < n && p.charAt(j + 1) == '*') {
                res = dp(s, i+1, p, j) || dp(s, i, p, j+2);
            } else {
                res = dp(s, i+1, p, j+1);
            }
        } else {
            if(j + 1 < n && p.charAt(j + 1) == '*') {
                res = dp(s, i, p, j+2);
            } else {
                return false;
            }
        }
        memo.put(key, res);
        return res;

    }
}