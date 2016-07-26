package com.saosinhome.md.mdpaygate.dao.reposervice;

import com.saosinhome.md.mdpaygate.dao.Model.QueueModel;

/**
 * Created by wangdalin(闪惠后台研发) on 2016/7/22 15:55.
 */
public interface QueueService {

    @DataSource(name = DataSource.master)
    public QueueModel create(QueueModel queueData);
}
