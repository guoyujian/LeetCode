

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2020/5/26 23:11
 * @Created by 11599
 */

public class Solution {

    public int romanToInt(String s) {
        int result = 0;
        for(int i=s.length()-1; i>=0; i--){
            int tmp = 0;
            switch (s.charAt(i)){
                case 'I': tmp = 1; break;
                case 'V': tmp = 5;
                    if(i-1 >= 0 && s.charAt(i-1) == 'I'){
                        tmp -= 1;
                        i--;
                    }
                    break;
                case 'X': tmp = 10;
                    if(i-1 >= 0 && s.charAt(i-1) == 'I'){
                        tmp -= 1;
                        i--;
                    }
                    break;
                case 'L': tmp = 50;
                    if(i-1 >= 0 && s.charAt(i-1) == 'X'){
                        tmp -= 10;
                        i--;
                    }
                    break;
                case 'C': tmp = 100;
                    if(i-1 >= 0 && s.charAt(i-1) == 'X'){
                        tmp -= 10;
                        i--;
                    }
                    break;
                case 'D': tmp = 500;
                    if(i-1 >= 0 && s.charAt(i-1) == 'C'){
                        tmp -= 100;
                        i--;
                    }
                    break;
                case 'M': tmp = 1000;
                    if(i-1 >= 0 && s.charAt(i-1) == 'C'){
                        tmp -= 100;
                        i--;
                    }
                    break;
                default: break;
            }
            result += tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}
