package com.zhxh.xreactnativelib;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GsonParser {

    public static <T> T parse(String resultStr, Class<T> t) {
        if (TextUtils.isEmpty(resultStr))
            return null;
        try {
            return new Gson().fromJson(resultStr, t);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 多态问题的处理
     *
     * @param resultStr   接口返回的字符串
     * @param t           要转换成的类型
     * @param baseType    要转换成的类型的共同基类
     * @param typeAdapter 自定义解析过程
     * @param <T>         转换成的类型
     * @return 转换成的类型
     */
    public static <T> T parse(String resultStr, Class<T> t, Type baseType, Object typeAdapter) {
        if (TextUtils.isEmpty(resultStr))
            return null;
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(baseType, typeAdapter)
                .create();
        return gson.fromJson(resultStr, t);
    }


    public static String parseGsonValue(String key, CharSequence input) {
        if (TextUtils.isEmpty(input)) return "";
        if (TextUtils.isEmpty(key)) return "";
        List<String> matches = new ArrayList<>();

        String regex = "(?<=\"" + key + "\":\")[^\"]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        if (matches.size() > 0) {
            return matches.get(0);
        }
        return "";
    }

    public static class StringAdapter implements JsonDeserializer<String> {

        @Override
        public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            try {
                return json.getAsString();
            } catch (Exception e) {
                return json.toString();
            }
        }
    }


/*    public static class BaseModelAdapter implements JsonDeserializer<ProfileHomeBaseType> {
        @Override
        public ProfileHomeBaseType deserialize(JsonElement json, Type typeOfT,
                                               JsonDeserializationContext context)
                throws JsonParseException {

            JsonObject jsonObj = json.getAsJsonObject();
            String type = jsonObj.get("type").getAsString();

            if (type.equals("5") || type.equals("7") || type.equals("81") || type.equals("82") || type.equals("83") || type.equals("84")) {
                return new Gson().fromJson(json, ProfileHomeItemArray.class);
            } else {
                return new Gson().fromJson(json, ProfileHomeItemKey.class);
            }
        }
    }*/
}
