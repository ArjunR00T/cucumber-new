package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    public static void init(){
        properties = new Properties();
        try {
            properties.load((new FileInputStream("src/test/resources/config.properties")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setProperty(String key,String value){
        properties.setProperty(key,value);
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
