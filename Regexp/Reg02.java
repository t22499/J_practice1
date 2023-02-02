package com.Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Reg02 {
    public static void main(String[] args) {
        String str = "我..我要....学学学..编程";
        String rep = "\\.";
        Pattern compile = Pattern.compile(rep);
        Matcher matcher = compile.matcher(str);
        String content = matcher.replaceAll("");

        System.out.println("content" + content);

        //我我要学学学编程
        String s1 = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(s1);



    }
}
