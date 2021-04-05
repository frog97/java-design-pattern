package com.parkgaram.dp.templatecreator.fw;

public abstract class Creator {

	public Item create(String itemName){
		
		// 요구 사항 DB에서 아이템 정보 읽어 오기
		init(itemName);
		Item item = createItem(itemName);
		// 요규 사항 DB에 아이템 생성 기록 남기기.
		end(itemName);
		
		return item;
	}
	
	abstract protected String end(String itemName); //createItemLog
	abstract protected String init(String itemName); //requestItemInfo
	abstract protected Item createItem(String itemName);
}
