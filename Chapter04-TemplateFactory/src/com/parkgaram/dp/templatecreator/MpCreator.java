package com.parkgaram.dp.templatecreator;

import com.parkgaram.dp.templatecreator.fw.Creator;
import com.parkgaram.dp.templatecreator.fw.Item;

import java.util.Date;

public class MpCreator extends Creator {

    @Override
    protected String end(String itemName) {
        String ret = "데이터베이스에서 마력 회복 물약의 생성 내역를 기록합니다." + new Date();
        System.out.println(ret);
        return ret;
    }

    @Override
    protected String init(String itemName) {
        String ret = "데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.";
        System.out.println(ret);
        return ret;
    }

    @Override
    protected Item createItem(String itemName) {
        return new MpPotion();
    }
}
