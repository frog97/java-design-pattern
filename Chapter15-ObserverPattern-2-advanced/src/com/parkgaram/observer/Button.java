package com.parkgaram.observer;

import java.util.Observable;

public class Button extends Observable{ // Button은 View의 일종이기 때문에 View, Obsavable까지 생속이 불가능함.
	
	public void onClick(){
		setChanged();
		notifyObservers();
	}

}
