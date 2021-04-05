package com.parkgaram.dp.templatecreator;

import com.parkgaram.dp.templatecreator.fw.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
