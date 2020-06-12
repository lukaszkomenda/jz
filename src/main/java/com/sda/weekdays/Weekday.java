package com.sda.weekdays;

public enum Weekday {
    MONDAY("poniedziałek", "monday", false),
    TUESDAY("wtorek", "tuesday", false),
    WEDNESDAY("środa", "wednesday", false),
    THURSDAY("czwartek", "thursday", false),
    FRIDAY("piątek", "friday", false),
    SATURDAY("sobota", "saturday", true),
    SUNDAY("niedziela", "sunday", true);

    private String plVersion;
    private String engVersion;
    private boolean isWeekend;

    Weekday(String plVersion, String engVersion, boolean isWeekend) {
        this.plVersion = plVersion;
        this.engVersion = engVersion;
        this.isWeekend = isWeekend;
    }

    Weekday(String option){
        this.plVersion = option;
        this.engVersion = option;
    }

    public String getPlVersion() {
        return plVersion;
    }

    public String getEngVersion() {
        return engVersion;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    void findByPolishName(String plVersion) throws
            UncheckedExceptionUnknownWeekdayException {

        if (this.plVersion != plVersion){
            throw new UncheckedExceptionUnknownWeekdayException("Wrong day");
        }
    }

    void findByEnglishName(String engVersion) throws
            UncheckedExceptionUnknownWeekdayException{

        if (this.engVersion != engVersion){
            throw new UncheckedExceptionUnknownWeekdayException("Wrong day");
        }
    }
}
