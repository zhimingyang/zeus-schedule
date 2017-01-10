package org.tom.zeus.schedule.task;

import java.util.Map;

/**
 * 带参的Task接口,可从配置中获取相应的参数
 */
public interface IScheduleParamTask extends IScheduleTask{

    /**
     * 任务执行接口
     */
    public void execute(Map<Object,Object> param);

}
