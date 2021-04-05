package com.parkgaram.dp.templatecreator;

import com.parkgaram.dp.templatecreator.fw.Item;

public class MpPotion implements Item {

    @Override
    public void use() {
        System.out.println("마력 회복!");
    }
}
