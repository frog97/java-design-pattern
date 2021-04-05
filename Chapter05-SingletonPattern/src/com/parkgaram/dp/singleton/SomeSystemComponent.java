package com.parkgaram.dp.singleton;

public class SomeSystemComponent {

	// 하나만 있어야 하므로 static
	private static SomeSystemComponent instance;
	private int somesetting1;
	
	private SomeSystemComponent() {
		somesetting1 = 5;
	}
	
	public static SomeSystemComponent getInstance(){
		if (instance == null) {
			System.out.println("신규 생성");
			instance = new SomeSystemComponent();
		}else {
			System.out.println("생성되어 있음.");
		}
		return instance;
	}

	public int getConf1() {
		return somesetting1;
	}

	public void setConf1(int set1) {
		somesetting1 = set1;
	}
}
