package com.Regexp;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Reg04 {
    public static void main(String[] args) {

        String str = "34.8.9";
        String reg = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        if (str.matches(reg)){
            System.out.println("匹配成功是整数或者小数");
        }else {
            System.out.println("匹配失败");
        }
    }
}
