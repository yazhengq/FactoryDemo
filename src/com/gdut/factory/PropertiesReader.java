package com.gdut.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @author ���� E-mail:
 * @date ����ʱ�䣺2016��4��25�� ����8:52:58
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class PropertiesReader {

	public Map<String, String> getProperties() {

		Properties props = new Properties();
		Map<String, String> map = new HashMap<String, String>();

		try {
			InputStream in = getClass().getResourceAsStream("type.properties");
			props.load(in);
			Enumeration en = props.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				String properties = props.getProperty(key);
				map.put(key, properties);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;
	}

}
