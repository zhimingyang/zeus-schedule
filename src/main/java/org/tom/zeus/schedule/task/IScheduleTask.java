package org.tom.zeus.schedule.task;

/**
 * 调度任务的接口类
 */
public interface IScheduleTask {

    /**
     *前置准备接口，例如一些数据库、缓存的连接
     */
    public void prepare();

    /**
     * 清理接口
     */
    public void cleanup();

}
