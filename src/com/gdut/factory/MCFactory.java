package com.gdut.factory;
/** 
 * 圣诞系统加工厂
 * @author  作者 E-mail: 
 * @date 创建时间：2016年4月25日 下午9:20:50 
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
