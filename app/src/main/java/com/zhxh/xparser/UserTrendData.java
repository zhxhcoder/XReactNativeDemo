package com.zhxh.xparser;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhxh on 2018/7/4
 */
public class UserTrendData {

    private int itemType;
    private String dynamicType;

    private String type;
    @SerializedName("id")
    private String topId;

    private String sourceID;
    private String mainID;


    private String userID;
    private String userName;
    private String userLogoUrl;
    private List<UserTrendData> userIcons;
    private String innerCode;
    private String stockCode;
    private String stockName;
    private String market;
    private String typeText;
    private String stockText;
    private String transactionUnitPriceText;
    private String transactionUnitPrice;
    /**
     * contentDict
     * [
     * {
     * "timezone": ""
     * },
     * {
     * "time": "05-21 13:06"
     * },
     * {
     * "typeText": "买入"
     * },
     * {
     * "stockText": "正泰电器(601877)"
     * },
     * {
     * "unitPriceText": "成交价"
     * },
     * {
     * "unitPrice": "28.39"
     * },
     * {
     * "positionText": "仓位占比"
     * },
     * {
     * "position": "0.3%"
     * }
     * ]
     */
    private String contentDict;
    private String addTime;
    private String listID;
    private String vip;
    private String vipText;
    private String description;
    private String isHSGT;
    private String isForeign;
    private String commentNum;
    private String commentNumText;


    /**
     * {
     * "dynamicType": 103,
     * "type": 1,
     * "userID": 4048181,
     * "userName": "数据水晶球",
     * "userLogoUrl": "https://i0.niuguwang.com/SavePhoto/2018/0427/23447/L_78BFCACFB6F2023B842B51FB9F315FD5.jpg",
     * "userIcons": [],
     * "innerCode": 7335,
     * "stockCode": "002742",
     * "stockName": "三圣股份",
     * "market": "2",
     * "contentDict": [
     * {
     * "typeText": "买入股票"
     * },
     * {
     * "stockText": "三圣股份(002742)"
     * },
     * {
     * "transactionUnitPriceText": "成交价格"
     * },
     * {
     * "transactionUnitPrice": "9.53元"
     * }
     * ],
     * "addTime": "06-20 14:08",
     * "listID": "24855284",
     * "vip": "0",
     * "vipText": "",
     * "description": "",
     * "isHSGT": "0",
     * "isForeign": "0",
     * "commentNum": "0",
     * "commentNumText": "0条评论"
     * }
     *
     * @return
     */


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogoUrl() {
        return userLogoUrl;
    }

    public void setUserLogoUrl(String userLogoUrl) {
        this.userLogoUrl = userLogoUrl;
    }

    public List<UserTrendData> getUserIcons() {
        return userIcons;
    }

    public void setUserIcons(List<UserTrendData> userIcons) {
        this.userIcons = userIcons;
    }

    public String getInnerCode() {
        return innerCode;
    }

    public void setInnerCode(String innerCode) {
        this.innerCode = innerCode;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public String getStockText() {
        return stockText;
    }

    public void setStockText(String stockText) {
        this.stockText = stockText;
    }

    public String getTransactionUnitPriceText() {
        return transactionUnitPriceText;
    }

    public void setTransactionUnitPriceText(String transactionUnitPriceText) {
        this.transactionUnitPriceText = transactionUnitPriceText;
    }

    public String getTransactionUnitPrice() {
        return transactionUnitPrice;
    }

    public void setTransactionUnitPrice(String transactionUnitPrice) {
        this.transactionUnitPrice = transactionUnitPrice;
    }

    public String getContentDict() {
        return contentDict;
    }

    public void setContentDict(String contentDict) {
        this.contentDict = contentDict;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getListID() {
        return listID;
    }

    public void setListID(String listID) {
        this.listID = listID;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getVipText() {
        return vipText;
    }

    public void setVipText(String vipText) {
        this.vipText = vipText;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsHSGT() {
        return isHSGT;
    }

    public void setIsHSGT(String isHSGT) {
        this.isHSGT = isHSGT;
    }

    public String getIsForeign() {
        return isForeign;
    }

    public void setIsForeign(String isForeign) {
        this.isForeign = isForeign;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getCommentNumText() {
        return commentNumText;
    }

    public void setCommentNumText(String commentNumText) {
        this.commentNumText = commentNumText;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTopId() {
        return topId;
    }

    public void setTopId(String topId) {
        this.topId = topId;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getMainID() {
        return mainID;
    }

    public void setMainID(String mainID) {
        this.mainID = mainID;
    }

    public String getDynamicType() {
        return dynamicType;
    }

    public void setDynamicType(String dynamicType) {
        this.dynamicType = dynamicType;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }


}
