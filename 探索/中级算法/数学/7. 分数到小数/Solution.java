package patterns.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 *
 * @Date 2020/7/19
 * @Created by 11599
 */
public class Solution {
    //核心思想：当余数出现循环时，商也会循环
    //抄的官方题解
    public String fractionToDecimal(int numerator, int denominator) {
        //如果被除数为0，则返回0
        if(numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if(numerator < 0 ^ denominator < 0) { //异号，则添加负号
            sb.append("-");
        }
        //换算成绝对值进行运算，为了防止溢出换算成long
        long dividend = Math.abs(Long.valueOf(numerator));
        long divisor = Math.abs(Long.valueOf(denominator));
        sb.append(String.valueOf(dividend / divisor)); // 先求商
        long remainder = dividend % divisor; //求余数
        if(remainder == 0) {
            return sb.toString();
        } //余数为0则返回
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>(); // key=余数， value=余数出现的位置
        //用一个散列表记录余数出现在小数部分的位置，
        //当你发现已经出现的余数，就可以将重复出现的小数部分用括号括起来
        while(remainder != 0) {
            if(map.containsKey(remainder)) {
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }
            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(String.valueOf(remainder / divisor));
            remainder %= divisor;
        }
        return sb.toString();
    }

}
