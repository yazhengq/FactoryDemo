package com.gdut.factory;

public class ClientTest {
	public static void main(String[] args) {

//这是interface接口
/*		HairInterface left = new LeftHair();
		left.draw();*/

//简单工厂
//业务逻辑放在工厂中处理
/* 		HairFactory factory = new HairFactory();
		HairInterface right = factory.getHair("right");
		right.draw();*/
		
/*		HairInterface left = factory.getHairByClass("com.gdut.factory.LeftHair");
		left.draw();
*/	
		
/*		HairInterface right = factory.getHairByClassKey("in");
		right.draw();*/

//抽象工厂
		PersonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drawWomen();

//抽象工厂
/*		PersonFactory factory = new HNFactory();
		Boy boy = factory.getBoy();
		boy.drawMan();*/
		
	}
}
