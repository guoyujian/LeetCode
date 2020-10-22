
import java.util.*;

/**
 * @Description 划分字母区间
 * @Date 2020/10/22
 * @Created by gyj
 */

public class Solution {
    public List<Integer> partitionLabels(String S) {
        //第一次遍历，确定所有字母出现的最远位置
        int[] maxPos = new int[26];
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            maxPos[chars[i] - 'a'] = i;
        }
        //第二次遍历，进行切割
        List<Integer> res = new ArrayList<>();
        int start = 0; //切割的起始位置
        int scanedCharMaxPos = 0; //已扫描过的字符的最远位置
        for (int i = 0; i < chars.length; i++) {
            int currCharMaxPos = maxPos[chars[i] - 'a']; //当前遍历的字母的最远位置
            // 选择“当前遍历字母的最远位置”和“扫描过的字符的最远位置”的较大的那个
            scanedCharMaxPos = Math.max(scanedCharMaxPos, currCharMaxPos);
            if(i == scanedCharMaxPos) { //如果i正好是已扫描字符的最远位置，就进行切割
                res.add(i - start + 1);
                start = i + 1; //下次切分的起始位置
            }
        }
        return res;
    }
}

