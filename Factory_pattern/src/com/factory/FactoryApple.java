package com.factory;

public class FactoryApple implements FruitFactory {
    //Apple��������Apple
	public Fruit Creat() {
		return new Apple();
	}

}
