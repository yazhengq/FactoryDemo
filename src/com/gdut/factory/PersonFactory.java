package com.gdut.factory;
/** 
 * �����ʵ�ֽӿ�
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2016��4��25�� ����9:18:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PersonFactory {
	//�к��ӿ�
	public Boy getBoy();
	//Ů���ӿ�
	public Girl getGirl();
}
