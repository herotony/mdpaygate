package com.saosinhome.md.mdpaygate.dao.Model;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:00.
 */
public class QueueBackModel {

    private java.lang.Long queueID;
    /** 业务类型 支付通知 退款通知  充退转账通知 */
    private java.lang.Integer type;
    /** 处理状态位 : 1:有效可处理（active） 3：临时被占用 （locked） 5：处理完毕 标记删除（deleted） */
    private java.lang.Integer status;
    /** 消费状态：1:未消费  2:消费成功 3：消费失败，等待下次消费 4：作废' */
    private java.lang.Integer consumeStatus;
    /** 创建时间 */
    private java.lang.Long createTime;
    /** 更新时间 */
    private java.lang.Long updateTime;
    /** 标签 (占用标签 预留) */
    private java.lang.String locker;
    /** md5签名 用来标记唯一 */
    private java.lang.String uniqueSign;
    /** 可消费开始时间 */
    private java.lang.Long nextConsumeTime;
    /** 上一次消费时间 */
    private java.lang.Long lastConsumeTime;
    /** 消费次数 */
    private java.lang.Integer consumeCount;
    private java.lang.String jsonData;

    /** 索引键 （trade_no  batch_no） */
    private java.lang.String tradeNo;

    public Long getQueueID() {
        return queueID;
    }

    public void setQueueID(Long queueID) {
        this.queueID = queueID;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConsumeStatus() {
        return consumeStatus;
    }

    public void setConsumeStatus(Integer consumeStatus) {
        this.consumeStatus = consumeStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getLocker() {
        return locker;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public String getUniqueSign() {
        return uniqueSign;
    }

    public void setUniqueSign(String uniqueSign) {
        this.uniqueSign = uniqueSign;
    }

    public Long getNextConsumeTime() {
        return nextConsumeTime;
    }

    public void setNextConsumeTime(Long nextConsumeTime) {
        this.nextConsumeTime = nextConsumeTime;
    }

    public Long getLastConsumeTime() {
        return lastConsumeTime;
    }

    public void setLastConsumeTime(Long lastConsumeTime) {
        this.lastConsumeTime = lastConsumeTime;
    }

    public Integer getConsumeCount() {
        return consumeCount;
    }

    public void setConsumeCount(Integer consumeCount) {
        this.consumeCount = consumeCount;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}
