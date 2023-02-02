package com.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Reg03 {
    public static void main(String[] args) {
        String str = "2249935621@qq.com";
        String reg = "\\w+@([a-zA-Z]+\\.)+[a-zA-Z]+";
        /*Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }*/
        if (str.matches(reg)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}
