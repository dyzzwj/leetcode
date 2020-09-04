package com.dyzwj.demo1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;

/**
 * 中缀表达式求值
 */
public class AfterPolandExpression {


    public static void main(String[] args) {

        AfterPolandExpression afterPolandExpression = new AfterPolandExpression();
        //1+((2+3)*4)-5 ==>  1 2 3 + 4 * + 5 -
        System.out.println(afterPolandExpression.middle2AfterPoland("1+((2+3)*4)-5"));
    }


    /**
     * 中缀表达式转后缀表达式
     *
     * 1、初始化两个栈：运算符栈s1和储存中间结果的栈s2；
     * 2、从左至右扫描中缀表达式；
     * 3、遇到操作数时，将其压s2；
     * 4、遇到运算符时，比较其与s1栈顶运算符的优先级：
         * 如果s1为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈；
         * 否则，若优先级比栈顶运算符的高，也将运算符压入s1（注意转换为前缀表达式时是优先级较高或相同，而这里则不包括相同的情况）；
         * 否则，将s1栈顶的运算符弹出并压入到s2中，再次转到(4-1)与s1中新的栈顶运算符相比较；
     * 5、遇到括号时：
         * 如果是左括号“(”，则直接压入s1；
         * 如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃；
     * 6、重复步骤2至5，直到表达式的最右边；
     * 7、将s1中剩余的运算符依次弹出并压入s2；
     * 8、依次弹出s2中的元素并输出，结果的逆序即为中缀表达式对应的后缀表达式（转换为前缀表达式时不用逆序）
     */
    public List<String> middle2AfterPoland(String middleExpression){
        Stack<String> expressionStack = new Stack<>();
        Stack<String> temp = new Stack<>();
        List<String> list = string2List(middleExpression);
        List<String> ll = new ArrayList<>();
        for (String item : list) {
            /**
             * 匹配多位数
             */
            if(item.matches("\\d+")){
//                temp.push(item);
                ll.add(item);
                /**
                 * 匹配运算符
                 */
            }else if("(".equals(item)){
                expressionStack.push(item);
            }else if(")".equals(item)){
                while (!expressionStack.peek().equals("(")){

                    ll.add(expressionStack.pop());
                }
                expressionStack.pop();
                /**
                 * 运算符
                 */
            }else{
//                if(expressionStack.isEmpty() || expressionStack.peek().equals("(")){
//                    expressionStack.push(item);
//                }
                while (!expressionStack.isEmpty() && Operation.getValue(expressionStack.peek() ) >= Operation.getValue(item)){
                    ll.add(expressionStack.pop());
                }
                expressionStack.push(item);
            }
        }

        /**
         * 将s1中剩余的运算符依次弹出并压入s2
         */
        while (!expressionStack.isEmpty()){
            ll.add(expressionStack.pop());
        }

//        StringBuilder sb = new StringBuilder();
//        while (!temp.isEmpty()){
//            sb.append(temp.pop());
//        }
//
//        return sb.toString();
        return ll;
    }

    public List<String> string2List(String string){

        List<String> res = new ArrayList<>();
        char[] s = string.toCharArray();
        for (char s1 : s) {
            res.add(String.valueOf(s1));
        }
        System.out.println(res);
        return res;

    }




}


class Operation {
    private static int ADDITION=1;
    private static int SUBTRACTION=1;
    private static int MULTIPLICATION=2;
    private static int DIVISION=2;

    public static int getValue(String operation){
        int result;
        switch (operation){
            case "+":
                result=ADDITION;
                break;
            case "-":
                result=SUBTRACTION;
                break;
            case "*":
                result=MULTIPLICATION;
                break;
            case "/":
                result=DIVISION;
                break;
            default:
//                System.out.println("不存在该运算符");
                result=0;
        }
        return result;
    }
}