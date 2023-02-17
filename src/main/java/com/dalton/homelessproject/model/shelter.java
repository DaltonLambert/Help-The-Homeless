package com.dalton.homelessproject.model;

public class shelter {

    private int id;
    private String shelterName;
    private String shelterAddress;
    private String shelterCapacity;
    private String shelterPhone;
    private String email;

    public shelter() {

    }

    public shelter(int id, String shelterName, String shelterAddress, String shelterCapacity, String shelterPhone, String email) {
        this.id = id;
        this.shelterName = shelterName;
        this.shelterAddress = shelterAddress;
        this.shelterCapacity = shelterCapacity;
        this.shelterPhone = shelterPhone;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
