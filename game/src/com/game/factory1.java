package com.game;

public class factory1 implements gameFactory {

	@Override
	public gameRule newRule() {
		System.out.println("��ɫ1�����ɹ�����");
		return new Rule1();
		
	}

}
