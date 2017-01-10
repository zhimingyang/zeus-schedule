package org.tom.zeus.schedule.common;

import java.io.*;
import java.util.Properties;

/**
 * 配置解析
 */
public class ConfigParser {

    /**
     * 配置文件解析
     * @param filePath
     * @return
     * @throws Exception
     */
    public Properties parse(String filePath) throws Exception {
        File confFile = new File(filePath);
        if(!confFile.exists()){
            throw new FileNotFoundException("target file not exists");
        }
        FileInputStream fin = new FileInputStream(confFile);
        Properties properties = new Properties();
        properties.load(fin);
        fin.close();
        return properties;
    }


}
