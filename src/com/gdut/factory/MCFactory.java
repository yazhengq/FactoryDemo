package com.gdut.factory;
/** 
 * ʥ��ϵͳ�ӹ���
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2016��4��25�� ����9:20:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class MCFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new MCBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new MCGirl();
	}

}
