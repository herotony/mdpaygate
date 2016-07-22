package com.saosinhome.md.mdpaygate.dao.Model;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:18.
 */
public class TradePayInfoModel {

    public long getPayTradeID() {
        return payTradeID;
    }

    public void setPayTradeID(long payTradeID) {
        this.payTradeID = payTradeID;
    }

    public String getShowUrl() {
        return showUrl;
    }

    public void setShowUrl(String showUrl) {
        this.showUrl = showUrl;
    }

    public String getRedirectPath() {
        return redirectPath;
    }

    public void setRedirectPath(String redirectPath) {
        this.redirectPath = redirectPath;
    }

    public String getNotifyURL() {
        return notifyURL;
    }

    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getAppEnv() {
        return appEnv;
    }

    public void setAppEnv(String appEnv) {
        this.appEnv = appEnv;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getCallBackURL() {
        return callBackURL;
    }

    public void setCallBackURL(String callBackURL) {
        this.callBackURL = callBackURL;
    }

    public String getOutUser() {
        return outUser;
    }

    public void setOutUser(String outUser) {
        this.outUser = outUser;
    }

    public String getSellerAccountName() {
        return sellerAccountName;
    }

    public void setSellerAccountName(String sellerAccountName) {
        this.sellerAccountName = sellerAccountName;
    }

    public String getMerchantURL() {
        return merchantURL;
    }

    public void setMerchantURL(String merchantURL) {
        this.merchantURL = merchantURL;
    }

    public String getPayLongitude() {
        return payLongitude;
    }

    public void setPayLongitude(String payLongitude) {
        this.payLongitude = payLongitude;
    }

    public String getPayLatitude() {
        return payLatitude;
    }

    public void setPayLatitude(String payLatitude) {
        this.payLatitude = payLatitude;
    }

    private long payTradeID;
    /** 商品链接地址 */
    private String showUrl;
    /** 跳转至第三方url地址 */
    private String redirectPath;
    /** 商户服务器通知地址 */
    private String notifyURL;
    /**商品名称**/
    private String subject;
    /**客户端号**/
    private String appID;
    /**客户端来源**/
    private String appEnv;
    /**发起支付手机IMEI**/
    private String imei;
    /**商品详情**/
    private String body;
    /**支付类型**/
    private String paymentType;
    /**支付成功跳转页面**/
    private String callBackURL;
    /**商户系统用户唯一标识**/
    private String outUser;
    /**卖家支付宝账号**/
    private String sellerAccountName;
    /**操作中断跳转地址**/
    private String merchantURL;

    /**
     * 支付用户经纬度
     */
    private String payLongitude;
    private String payLatitude;
}
