package com.dyzwj.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/***
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 */
public class IsValid {

    public  Map<Character,Character> mappping;
    public IsValid(){
        this.mappping = new HashMap<>();
        mappping.put(')','(');
        mappping.put('}','{');
        mappping.put(']','[');
    }


    public static void main(String[] args) {

        IsValid isValid = new IsValid();
        System.out.println(isValid.isValid(""));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if(mappping.containsKey(ch)){
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if(topElement != mappping.get(ch)){
                    return false;
                }
            }else {
                stack.push(chars[i]);
            }
        }

        return stack.isEmpty();
    }
}
