package com.saosinhome.md.mdpaygate.dao.Model;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:30.
 */
public class RefundLogModel {

    private java.lang.Long refundLogId ;
    private java.lang.Integer opType ;
    private java.lang.Integer refundStatus;
    private java.lang.Long createTime ;
    private java.lang.Long refundId ;
    private java.lang.String userClientIp ;
    private java.lang.String userClientReferer ;
    private java.lang.String userClientImei ;
    private java.lang.String jsonData ;

    public Long getRefundLogId() {
        return refundLogId;
    }

    public void setRefundLogId(Long refundLogId) {
        this.refundLogId = refundLogId;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getRefundId() {
        return refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getUserClientIp() {
        return userClientIp;
    }

    public void setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
    }

    public String getUserClientReferer() {
        return userClientReferer;
    }

    public void setUserClientReferer(String userClientReferer) {
        this.userClientReferer = userClientReferer;
    }

    public String getUserClientImei() {
        return userClientImei;
    }

    public void setUserClientImei(String userClientImei) {
        this.userClientImei = userClientImei;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}
