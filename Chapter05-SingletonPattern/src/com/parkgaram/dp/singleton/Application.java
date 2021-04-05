package com.parkgaram.dp.singleton;

public class Application {

	public static void main(String[] args) {
		SomeSystemComponent component1 = SomeSystemComponent.getInstance();
		SomeSystemComponent component2 = SomeSystemComponent.getInstance();

		System.out.println(component1.getConf1());
		System.out.println(component2.getConf1());

		component1.setConf1(11);
		System.out.println(component1.getConf1());
		System.out.println(component2.getConf1());

		component2.setConf1(22);
		System.out.println(component1.getConf1());
		System.out.println(component2.getConf1());
	}

}
