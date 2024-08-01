package com.qascript.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

    public static Properties properties = new Properties();
    static FileInputStream fls;

    public static Properties loadApplicationProperties() throws IOException {
        try {
            fls = new FileInputStream("src/test/resources/config/application.properties");
            properties.load(fls);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties frameworkProperties() throws IOException {
        try {
            fls = new FileInputStream("src/test/resources/config/framework.properties");
            properties.load(fls);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static Properties userProperties() throws IOException {
        try {
            fls = new FileInputStream("src/test/resources/config/user.properties");
            properties.load(fls);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

}
