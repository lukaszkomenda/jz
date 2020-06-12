package com.sda.postOffice;

import java.util.UUID;

public class Package {
    private PackageStatus status;
    private String contens;
    private String packageNumber;

    public Package(String contens){
        this.contens = contens;
        this.status = PackageStatus.SENT;
        this.packageNumber = UUID.randomUUID().toString();
    }

    public void changeStatus (PackageStatus status){
        this.status = status;
    }

    public PackageStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Package{" +
                "status=" + status +
                ", contens='" + contens + '\'' +
                ", packageNumber='" + packageNumber + '\'' +
                '}';
    }
}
