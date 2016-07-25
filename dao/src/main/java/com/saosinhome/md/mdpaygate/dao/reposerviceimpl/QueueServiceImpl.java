package com.saosinhome.md.mdpaygate.dao.reposerviceimpl;

import com.saosinhome.md.mdpaygate.dao.Model.QueueModel;
import com.saosinhome.md.mdpaygate.dao.reposervice.DataSource;
import com.saosinhome.md.mdpaygate.dao.reposervice.QueueService;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 16:12.
 */
public class QueueServiceImpl extends SqlSessionDaoSupport implements QueueService  {

    @DataSource(name = DataSource.master)
    public QueueModel create(QueueModel queueData){

        if(queueData==null)
            return null;

        int affectedRow = getSqlSession().insert("createQueue",queueData);

        if(queueData.getQueueID()>0 && affectedRow>0)
            return  queueData;

        return  null;
    }
}
