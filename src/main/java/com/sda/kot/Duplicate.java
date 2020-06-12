package com.sda.kot;

public class Duplicate implements StringOperation {

    @Override
    public String modify(String text) {
        return text.repeat(2);
    }
}
