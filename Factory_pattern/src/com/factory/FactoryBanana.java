package com.factory;

public class FactoryBanana implements FruitFactory {
	//Banana��������Banana
	public Fruit Creat() {
		return new Banana();
	}

}
