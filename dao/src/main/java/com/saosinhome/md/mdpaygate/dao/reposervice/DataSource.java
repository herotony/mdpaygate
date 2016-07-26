package com.saosinhome.md.mdpaygate.dao.reposervice;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/25 17:27.
 */

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

     String  name() default DataSource.master;

    public static String master="master";
    public static String slave1="slave1";
    public static String slave2="slave2";
    public static String slave3="slave3";
    public static String slave4="slave4";
    public static String slave5="slave5";
    public static String slave6="slave6";
}
