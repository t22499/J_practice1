package com.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Reg01 {
    public static void main(String[] args) {


        String s2 = "9559 8558 9988";
        String reg1 = "(\\d)(\\d)\\2\\1";
        //(?!)abc不区分大小写
        //Pattern.CASE_INSENSITIVE不区分大小写
        Pattern pattern = Pattern.compile(reg1,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s2);
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
        }

    }
}
