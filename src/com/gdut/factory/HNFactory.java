package com.gdut.factory;
/** 
 * ����ϵ�мӹ���
 * @author  ���� E-mail: 
 * @date ����ʱ�䣺2016��4��25�� ����9:22:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class HNFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new HNBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNGirl();
	}

}
