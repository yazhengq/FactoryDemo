package com.gdut.factory;

import java.util.Map;

public class HairFactory {
	
	public HairInterface getHair(String key) {
		if ("left".equals(key)) {
			LeftHair leftHair = new LeftHair();
			return leftHair;
		} else if ("right".equals(key)) {
			// ���������RightHair�յĹ��췽��
			return new RightHair();
		}
		return null;
	}
	
	/*
	 * ��ķ�����ƣ������������ʵ��
	 * */
	public HairInterface getHairByClass(String className){
		try {
			HairInterface hair = (HairInterface) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public HairInterface getHairByClassKey(String key){
		try {
			Map<String, String> map = new PropertiesReader().getProperties();
			
			HairInterface hair = (HairInterface) Class.forName(map.get(key)).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
