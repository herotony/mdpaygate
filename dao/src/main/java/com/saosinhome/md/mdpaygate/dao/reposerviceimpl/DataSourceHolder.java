package com.saosinhome.md.mdpaygate.dao.reposerviceimpl;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/26 9:11.
 */
public class DataSourceHolder {

    //ThreadLocal变量与static类的绝配模式，确保不同线程取到的是各自线程范围内的dataSources，相互隔绝。
    //线程本地环境
    private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();
    //设置数据源
    public static void setDataSource(String customerType) {
        dataSources.set(customerType);
    }
    //获取数据源
    public static String getDataSource() {
        return (String) dataSources.get();
    }
    //清除数据源
    public static void clearDataSource() {
        dataSources.remove();
    }

}
