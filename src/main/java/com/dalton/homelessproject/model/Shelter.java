package com.dalton.homelessproject.model;

public class Shelter {
    private int shelterId;
    private String shelterName;
    private String shelterAddress;
    private String shelterCapacity;
    private String shelterPhone;
    private String shelterEmail;

    public Shelter() {

    }
    public Shelter(int shelterId, String shelterName, String shelterAddress, String shelterCapacity, String shelterPhone, String shelterEmail) {
        this.shelterId = shelterId;
        this.shelterName = shelterName;
        this.shelterAddress = shelterAddress;
        this.shelterCapacity = shelterCapacity;
        this.shelterPhone = shelterPhone;
        this.shelterEmail = shelterEmail;
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

    public String getShelterCapacity() {
        return shelterCapacity;
    }

    public void setShelterCapacity(String shelterCapacity) {
        this.shelterCapacity = shelterCapacity;
    }

    public String getShelterPhone() {
        return shelterPhone;
    }

    public void setShelterPhone(String shelterPhone) {
        this.shelterPhone = shelterPhone;
    }

    public String getShelterEmail() {
        return shelterEmail;
    }

    public void setShelterEmail(String email) {
        this.shelterEmail = shelterEmail;
    }
    @Override
    public String toString() {
        return "Shelter{" +
                "shelterId=" + shelterId +
                ", shelterName='" + shelterName + '\'' +
                ", shelterAddress='" + shelterAddress + '\'' +
                ", shelterCapacity='" + shelterCapacity + '\'' +
                ", shelterPhone='" + shelterPhone + '\'' +
                ", shelterEmail='" + shelterEmail + '\'' +
                '}';
    }



}
