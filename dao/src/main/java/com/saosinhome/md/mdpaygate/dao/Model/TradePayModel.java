package com.saosinhome.md.mdpaygate.dao.Model;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:12.
 */
public class TradePayModel {

    private long payTradeID;
    /** 业务方 */
    private int businessType;
    /** 状态位 */
    private int status;
    /** 创建时间 */
    private long createTime;
    /** 失效时间 */
    private int expireTime;
    /** 更新时间 */
    private long updateTime;
    /** 支付方式 */
    private int payType;
    /** 支付银行 */
    private String payBank;
    /** 交易id */
    private String tradeId;
    /** 商户订单号 */
    private String tradeNo;
    /** 交易金额 */
    private int tradeMoney;
    /** 通知状态位 */
    private int notifyStatus;
    /** 业务方最后一次通知时间 */
    private long notifyTime;
    /** 支付时间 */
    private long payTime;
    /** 第三方交易流水号 */
    private String thirdTradeNo;
    /**买家支付宝用户号**/
    private String thirdPayUserID;
    /**买家支付宝账号**/
    private String thirdPayUserName;
    /**用户id**/
    private int userID;
    /**token 授权**/
    private String externToken;
    /** 交易包的商品总数量*/
    private int tradeGoodsAmount;
    /** 门店ID */
    private long shopID;
    /**商户id**/
    private long supplierID;

    public long getPayTradeID() {
        return payTradeID;
    }

    public void setPayTradeID(long payTradeID) {
        this.payTradeID = payTradeID;
    }

    public int getBusinessType() {
        return businessType;
    }

    public void setBusinessType(int businessType) {
        this.businessType = businessType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getPayBank() {
        return payBank;
    }

    public void setPayBank(String payBank) {
        this.payBank = payBank;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(int tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public int getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(int notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public long getNotifyTime() {
        return notifyTime;
    }

    public void setNotifyTime(long notifyTime) {
        this.notifyTime = notifyTime;
    }

    public long getPayTime() {
        return payTime;
    }

    public void setPayTime(long payTime) {
        this.payTime = payTime;
    }

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public String getThirdPayUserID() {
        return thirdPayUserID;
    }

    public void setThirdPayUserID(String thirdPayUserID) {
        this.thirdPayUserID = thirdPayUserID;
    }

    public String getThirdPayUserName() {
        return thirdPayUserName;
    }

    public void setThirdPayUserName(String thirdPayUserName) {
        this.thirdPayUserName = thirdPayUserName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getExternToken() {
        return externToken;
    }

    public void setExternToken(String externToken) {
        this.externToken = externToken;
    }

    public int getTradeGoodsAmount() {
        return tradeGoodsAmount;
    }

    public void setTradeGoodsAmount(int tradeGoodsAmount) {
        this.tradeGoodsAmount = tradeGoodsAmount;
    }

    public long getShopID() {
        return shopID;
    }

    public void setShopID(long shopID) {
        this.shopID = shopID;
    }

    public long getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(long supplierID) {
        this.supplierID = supplierID;
    }
}
