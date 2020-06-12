package com.sda.kot;

import java.util.ArrayList;
import java.util.List;

public class TextCenzor implements StringOperation {
    @Override
    public String modify(String text) {
        List<String> forbiddenWords = new ArrayList<>();
        forbiddenWords.add("ALA");
        forbiddenWords.add("KOTA");

        text = text.replace("ALA", "***");
        text = text.replace("KOTA", "****");

        char[] in = text.toCharArray();

        return new String(in);
    }
}
