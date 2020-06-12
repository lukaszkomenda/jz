package com.sda.kot;

public class TextTruncate implements StringOperation {
    @Override
    public String modify(String text) {
        int length = 5;
        return text.substring(0,length-1);
    }
}
