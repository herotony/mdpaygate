package com.saosinhome.md.mdpaygate.dao.Model;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:25.
 */
public class TradePayLogModel {

    /**主键**/
    private long logID;
    /**交易id**/
    private long payTradeID;
    /**日志类型**/
    private int type;
    /**状态位**/
    private int status;
    /**创建时间**/
    private long createTime;
    /**ip地址**/
    private java.lang.String ip;
    /**referer地址**/
    private java.lang.String referer;
    /**记录数据信息（json格式）**/
    private java.lang.String jsonData;

    public long getLogID() {
        return logID;
    }

    public void setLogID(long logID) {
        this.logID = logID;
    }

    public long getPayTradeID() {
        return payTradeID;
    }

    public void setPayTradeID(long payTradeID) {
        this.payTradeID = payTradeID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }
}
