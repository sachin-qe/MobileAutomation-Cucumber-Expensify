package com.sachin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMap {

    Properties properties;

    public PropertiesMap(String FilePath) {
        try {
            FileInputStream Locator = new FileInputStream(FilePath);
            properties = new Properties();
            properties.load(Locator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getData(String ElementName) throws Exception {
        // Read value using the logical name as Key
        return properties.getProperty(ElementName);
    }

}