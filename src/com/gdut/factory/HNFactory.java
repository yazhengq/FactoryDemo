package com.gdut.factory;
/** 
 * 新年系列加工厂
 * @author  作者 E-mail: 
 * @date 创建时间：2016年4月25日 下午9:22:32 
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
