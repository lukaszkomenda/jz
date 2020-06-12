package com.sda.diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class diaryApp {
    private static class Entry{
        String text;
        LocalDate date;
    }

    List<Entry> entries = new ArrayList<>();

    public void addEntry (String text){
        LocalDate now = LocalDate.now();

        Entry entry = new Entry();
        entry.date = now;
        entry.text = text;

        entries.add(entry);
    }

    public String getEntry (LocalDate localDate){
        String foundText = null;
        for (Entry entry : entries) {

            if (entry.date.equals(localDate)){
                foundText = entry.text;
                break;
            }
        }
        return foundText;
    }
}
