//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 
//
// 示例 1: 
//
// 输入: 123
//输出: 321
// 
//
// 示例 2: 
//
// 输入: -123
//输出: -321
// 
//
// 示例 3: 
//
// 输入: 120
//输出: 21
// 
//
// 注意: 
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231, 231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。 
// Related Topics 数学 
// 👍 2445 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if(x < 0){
            x = -x;
            flag = true;
        }
        int num = 0;
        int res = 0;
        while (x > 0){
            num = x % 10;
            x = x / 10;
            res = res * 10 + num;
        }

        return flag ? -res : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
