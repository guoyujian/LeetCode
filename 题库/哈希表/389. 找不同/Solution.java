
/**
 * @Description 389. 找不同
 * @Date 2020/12/18
 * @Created by gyj
 */
class Solution {
    public char findTheDifference(String s, String t) { //数数就完了

        int[] s_char_nums = new int[26];
        int[] t_char_nums = new int[26];
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            s_char_nums[ss[i]-'a'] ++;
        }
        for (int i = 0; i < ts.length; i++) {
            t_char_nums[ts[i]-'a'] ++;
        }
        for (int i = 0; i < 26; i++) {
            if(s_char_nums[i]!=t_char_nums[i]) {
                return (char)('a' + i);
            }
        }
        return ' ';
    }
}