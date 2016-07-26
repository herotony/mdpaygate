package com.saosinhome.md.mdpaygate.dao.reposerviceimpl;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/26 8:59.
 *
 * 实现spring-jdbc的动态数据源切换
 *
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Object determineCurrentLookupKey(){

        //实现动态切换数据源
        return DataSourceHolder.getDataSource();
    }
}
