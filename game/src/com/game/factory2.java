package com.game;

public class factory2 implements gameFactory {

	@Override
	public gameRule newRule() {
		System.out.println("��ɫ1�����ɹ�����");
	    return new Rule2(); 
	}

}
