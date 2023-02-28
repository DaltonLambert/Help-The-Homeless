package com.dalton.homelessproject.model;

public class Shelter {
    private int shelterId;
    private String shelterName;
    private String shelterAddress;
    private String shelterWebsite;
    private String shelterPhone;


    public Shelter() {

    }
    public Shelter(int shelterId, String shelterName, String shelterAddress, String shelterWebsite, String shelterPhone) {
        this.shelterId = shelterId;
        this.shelterName = shelterName;
        this.shelterAddress = shelterAddress;
        this.shelterWebsite = shelterWebsite;
        this.shelterPhone = shelterPhone;
    }
    public int getShelterId() {
        return shelterId;
    }

    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public String getShelterAddress() {
        return shelterAddress;
    }

    public void setShelterAddress(String shelterAddress) {
        this.shelterAddress = shelterAddress;
    }

    public String getShelterWebsite() {
        return shelterWebsite;
    }

    public void setShelterWebsite(String shelterWebsite) {
        this.shelterWebsite = shelterWebsite;
    }

    public String getShelterPhone() {
        return shelterPhone;
    }

    public void setShelterPhone(String shelterPhone) {
        this.shelterPhone = shelterPhone;
    }


    @Override
    public String toString() {
        return "Shelter{" +
                "shelterId=" + shelterId +
                ", shelterName='" + shelterName + '\'' +
                ", shelterAddress='" + shelterAddress + '\'' +
                ", shelterWebsite='" + shelterWebsite + '\'' +
                ", shelterPhone='" + shelterPhone + '\'' +
                '}';
    }



}
