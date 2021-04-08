package com.parkgaram.memento;

import java.util.Stack;

import com.parkgaram.memento.abc.Memento;
import com.parkgaram.memento.abc.Originator;

public class Application {

	public static void main(String[] args) {
		
		Stack<Memento> mementos = new Stack<>();
		
		Originator originator = new Originator();
		
		originator.setState("state 1"); // 원본의 상태를 1로 만들고..
		mementos.push(originator.createMemento()); //메멘토 객제에 state 저장.. caretaker에 해당하는 것은. stack 사용.
//		Memento memento = new Memento();//X 이런식을 가져와서 읽어 가는 것. 내용을 탈취하는 것을 막기 위해  protected를 쓰고 같은 package안에 넣어 줘야 한다.
//		memento.getState();//X
		originator.setState("state 2"); // 원본의 상태를 2로 만들고
		mementos.push(originator.createMemento()); // 상태 저장.
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());//state Final
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());//state 3
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());//state 2
		originator.restoreMemento(mementos.pop());
		System.out.println(originator.getState());//state 1
	
		
	}
}
