package com.sda.kot;

public class RemoveALetters implements StringOperation {
    @Override
    public String modify(String text) {
        return text.replaceAll("[A]","");
    }
}
