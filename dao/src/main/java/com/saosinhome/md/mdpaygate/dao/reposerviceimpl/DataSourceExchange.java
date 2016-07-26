package com.saosinhome.md.mdpaygate.dao.reposerviceimpl;

import com.saosinhome.md.mdpaygate.dao.reposervice.DataSource;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/26 8:51.
 *
 * 通过AOP来的前置拦截器来设置数据源
 */
public class DataSourceExchange implements org.aopalliance.intercept.MethodInterceptor {

    public Object invoke(MethodInvocation invocation) throws Throwable{

        DataSource dataSource = invocation.getMethod().getAnnotation(DataSource.class);
        DataSourceHolder.setDataSource(dataSource.name());

        try{

            return invocation.proceed();

        }catch(Exception e){

            //logger.error(" ouccur error:"+e.getMessage()+"\n"+e.getStackTrace());
        }

        return  null;
    }

}
