package com.zhxh.xreactnativelib;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    //参考 https://github.com/zzhoujay/RichText

    public static List<String> getRegEx(String input, String regex) {
        List<String> stringList = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m;
        m = p.matcher(input);
        while (m.find())
            stringList.add(m.group());

        return stringList;
    }

}
