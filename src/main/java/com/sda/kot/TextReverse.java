package com.sda.kot;

public class TextReverse implements StringOperation {
    @Override
    public String modify(String text) {

        char[] in = text.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);

    }
}
