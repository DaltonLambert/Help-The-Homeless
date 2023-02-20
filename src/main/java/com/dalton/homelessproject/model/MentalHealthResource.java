package com.dalton.homelessproject.model;

public class MentalHealthResource {
    private int healthId;
    private String healthName;
    private String healthAddress;
    private String healthWebsite;
    private String healthPhone;
    private String healthDescription;

    public MentalHealthResource(){

    }
    public MentalHealthResource(int healthId, String healthName, String healthAddress, String healthWebsite, String healthPhone, String healthDescription) {
        this.healthId = healthId;
        this.healthName = healthName;
        this.healthAddress = healthAddress;
        this.healthWebsite = healthWebsite;
        this.healthPhone = healthPhone;
        this.healthDescription = healthDescription;
    }

    public int getHealthId() {
        return healthId;
    }

    public void setHealthId(int healthId) {
        this.healthId = healthId;
    }

    public String getHealthName() {
        return healthName;
    }

    public void setHealthName(String healthName) {
        this.healthName = healthName;
    }

    public String getHealthAddress() {
        return healthAddress;
    }

    public void setHealthAddress(String healthAddress) {
        this.healthAddress = healthAddress;
    }

    public String getHealthWebsite() {
        return healthWebsite;
    }

    public void setHealthWebsite(String healthWebsite) {
        this.healthWebsite = healthWebsite;
    }

    public String getHealthPhone() {
        return healthPhone;
    }

    public void setHealthPhone(String healthPhone) {
        this.healthPhone = healthPhone;
    }

    public String getHealthDescription() {
        return healthDescription;
    }

    public void setHealthDescription(String healthDescription) {
        this.healthDescription = healthDescription;
    }

    @Override
    public String toString() {
        return "MentalHealthResource{" +
                "healthId=" + healthId +
                ", healthName='" + healthName + '\'' +
                ", healthAddress='" + healthAddress + '\'' +
                ", healthWebsite='" + healthWebsite + '\'' +
                ", healthPhone='" + healthPhone + '\'' +
                ", healthDescription='" + healthDescription + '\'' +
                '}';
    }




}
