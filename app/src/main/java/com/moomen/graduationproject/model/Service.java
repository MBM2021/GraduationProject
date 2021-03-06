package com.moomen.graduationproject.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Service implements Serializable {
    @SerializedName("image")
    String image;
    @SerializedName("city")
    String city;
    @SerializedName("name")
    String name;
    @SerializedName("ownerName")
    String ownerName;
    @SerializedName("phone")
    String phone;
    @SerializedName("location")
    String location;
    @SerializedName("detail")
    String detail;
    @SerializedName("status")
    boolean status;
    @SerializedName("type")
    String type;
    @SerializedName("date")
    String date;
    @SerializedName("price")
    double price;
    @SerializedName("companyId")
    String companyId;


    public Service() {
    }

    public Service(String image, String city, String name, String ownerName, String phone
            , String location, String detail, boolean status, String type, String date, double price, String companyId) {
        this.image = image;
        this.city = city;
        this.name = name;
        this.ownerName = ownerName;
        this.phone = phone;
        this.location = location;
        this.detail = detail;
        this.status = status;
        this.type = type;
        this.date = date;
        this.price = price;
        this.companyId = companyId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getServiceId() {
        return companyId;
    }

    public void setServiceId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
