/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        int temp = 0;
        while (true) {
            temp = 0;
            while (num > 0) {
                temp += num % 10;
                num = num / 10;
            }
            if (temp < 10) {
                break;
            } else {
                num = temp;
            }
        }
        return temp;
    }
}
// @lc code=end
/**
 * 考点在于，利用 % 和 / 运算分解出每个数位，然后使用循环累加
 */