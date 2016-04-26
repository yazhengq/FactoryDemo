package com.gdut.factory;
/** 
 * 人物的实现接口
 * @author  作者 E-mail: 
 * @date 创建时间：2016年4月25日 下午9:18:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface PersonFactory {
	//男孩接口
	public Boy getBoy();
	//女孩接口
	public Girl getGirl();
}
