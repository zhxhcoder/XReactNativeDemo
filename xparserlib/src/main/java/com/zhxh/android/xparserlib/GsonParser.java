package com.zhxh.android.xparserlib;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

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
     ProfileHomeResponse data = GsonParser.parse(
     resultStr,
     ProfileHomeResponse.class,
     new TypeToken<ProfileHomeResponse.ProfileHomeBaseType>() {
     }.getType(),
     new ProfileHomeResponse.BaseModelAdapter());

     * @param resultStr
     * @param t
     * @param baseType
     * @param typeAdapter
     * @param <T>
     * @return
     */
    public static <T> T parse(String resultStr, Class<T> t, Type baseType, Object typeAdapter) {
        if (TextUtils.isEmpty(resultStr))
            return null;
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(baseType, typeAdapter)
                .create();
        return gson.fromJson(resultStr, t);
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
