package com.zhxh.xparser;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by zhxh on 2018/7/4
 */
public class UserTrendResponse {
    private String result;

    private String code;

    private String minBoundaryId;

    private String maxBoundaryId;

    private int totalUnread;
    /**
     * 0-没有 1- 空页推荐 取6人 2-顶部一键关注
     */
    private int recommendUserType;

    private List<UserTrendData> data;

    private String title;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<UserTrendData> getData() {
        return data;
    }

    public void setData(List<UserTrendData> data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMinBoundaryId() {
        return minBoundaryId;
    }

    public void setMinBoundaryId(String minBoundaryId) {
        this.minBoundaryId = minBoundaryId;
    }

    public String getMaxBoundaryId() {
        return maxBoundaryId;
    }

    public void setMaxBoundaryId(String maxBoundaryId) {
        this.maxBoundaryId = maxBoundaryId;
    }

    public int getTotalUnread() {
        return totalUnread;
    }

    public void setTotalUnread(int totalUnread) {
        this.totalUnread = totalUnread;
    }

    public int getRecommendUserType() {
        return recommendUserType;
    }

    public void setRecommendUserType(int recommendUserType) {
        this.recommendUserType = recommendUserType;
    }


    public static class BaseModelAdapter implements JsonDeserializer<String> {
        @Override
        public String deserialize(JsonElement json, Type typeOfT,
                                  JsonDeserializationContext context)
                throws JsonParseException {

            JsonObject jsonObj = json.getAsJsonObject();
            String result = jsonObj.get("contentDict").getAsString();
            return result;
        }
    }
}
