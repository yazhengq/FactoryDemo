package com.gdut.factory;

public class ClientTest {
	public static void main(String[] args) {

//����interface�ӿ�
/*		HairInterface left = new LeftHair();
		left.draw();*/

//�򵥹���
//ҵ���߼����ڹ����д���
/* 		HairFactory factory = new HairFactory();
		HairInterface right = factory.getHair("right");
		right.draw();*/
		
/*		HairInterface left = factory.getHairByClass("com.gdut.factory.LeftHair");
		left.draw();
*/	
		
/*		HairInterface right = factory.getHairByClassKey("in");
		right.draw();*/

//���󹤳�
		PersonFactory factory = new MCFactory();
		Girl girl = factory.getGirl();
		girl.drawWomen();

//���󹤳�
/*		PersonFactory factory = new HNFactory();
		Boy boy = factory.getBoy();
		boy.drawMan();*/
		
	}
}
