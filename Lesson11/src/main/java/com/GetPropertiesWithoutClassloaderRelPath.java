package com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by WEO on 7/26/16.
 */
public class GetPropertiesWithoutClassloaderRelPath {

    public static void main(String[] args) throws IOException {
       InputStream resourseAsStream = GetPropertiesWithoutClassloaderRelPath.class.getResourceAsStream("test.properties");

        Properties properties = new Properties();

        properties.load(resourseAsStream);

        for (String key: properties.stringPropertyNames()) {
            System.out.println("key=" +key+" value="+properties.get(key));
        }

    }


}
