package com.sda.postOffice;

public enum PackageStatus {
    SENT ("paczka została nadana, ale jeszcze nie wyjechała w podróż.", 1),
    COURIER ("paczka jest już u kuriera w doręczeniu.", 2),
    DELIVERED ("paczka została dostarczona.", 3),
    LOST ("paczka została zagubiona.", 4),
    RETURNED ("paczka została zwrócona do nadawcy.", 5),
    TRAVELLING ("paczka jest w trakcie podróży między oddziałami.", 6);

    private final String description;
    private final int statusCode;

    PackageStatus(String description, int statusCode) {
        this.description = description;
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public int getStatusCode() {
        return statusCode;
    }




}
