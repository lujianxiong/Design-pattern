package com.factory;

public class Client {
	public static void main(String[] args) {
		//��������ˮ���ӹ���
		FactoryApple aFactory = new FactoryApple();
		FactoryBanana bFactory = new FactoryBanana();
		//��ʾ�ӹ���Ϣ
		aFactory.Creat().show();
		bFactory.Creat().show();

	}

}
