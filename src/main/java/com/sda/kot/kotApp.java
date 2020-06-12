package com.sda.kot;

public class kotApp {
    public static void main(String[] args) {
        UpperCase upperCase = new UpperCase();
        Duplicate duplicate = new Duplicate();
        RemoveALetters removeALetters = new RemoveALetters();
        TextTruncate textTruncate = new TextTruncate();
        TextReverse textReverse = new TextReverse();
        TextCenzor textCenzor = new TextCenzor();

        String text = "Ala ma kota";

        System.out.println("Text before meodify: " + text);

        text = upperCase.modify(text);
        System.out.println("Text after modify: " + text);

        text = textCenzor.modify(text);
        System.out.println("Text after modify: " + text);

        text = duplicate.modify(text);
        System.out.println("Text after modify: " + text);

        text = removeALetters.modify(text);
        System.out.println("Text after modify: " + text);

        text = textTruncate.modify(text);
        System.out.println("Text after modify: " + text);

        text = textReverse.modify(text);
        System.out.println("Text after modify: " + text);

    }


}
