package org.tom.zeus.schedule.common;

/**
 * 常量定义类
 */
public class Constants {

    private static String taskName = "taskname";

    private static int currency = 1;

    private static String taskSetupCron = "* * * 0";

    private static String taskShutDownCron = "* * *8";

    private static long heatTimesMils = 2000;

    private static String zkHost = "localhost";

    private static int zkPort = 2181;

    private static long sessionTimeOut = 6000;


    public static String getTaskName() {
        return taskName;
    }

    public static int getCurrency() {
        return currency;
    }

    public static String getTaskSetupCron() {
        return taskSetupCron;
    }

    public static String getTaskShutDownCron() {
        return taskShutDownCron;
    }

    public static long getHeatTimesMils() {
        return heatTimesMils;
    }

    public static String getZkHost() {
        return zkHost;
    }

    public static int getZkPort() {
        return zkPort;
    }

    public static long getSessionTimeOut() {
        return sessionTimeOut;
    }

}
