package com.saosinhome.md.mdpaygate.dao.reposervice;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/25 17:27.
 */

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    String name() default DataSource.master;

    public static String master="writeDataSource";
    public static String slave1="readDataSource1";
    public static String slave2="readDataSource2";
}
