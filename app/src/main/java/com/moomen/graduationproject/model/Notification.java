package com.moomen.graduationproject.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Notification implements Serializable {
    @SerializedName("userImage")
    String userImage;
    @SerializedName("title")
    String title;
    @SerializedName("description")
    String description;
    @SerializedName("shortDescription")
    String shortDescription;
    @SerializedName("date")
    String date;
    @SerializedName("serviceUid")
    String serviceUid;
    @SerializedName("hallUid")
    String hallUid;
    @SerializedName("userUid")
    String userUid;
    @SerializedName("notificationType")
    String notificationType;
    @SerializedName("status")
    boolean status;
    @SerializedName("seen")
    boolean seen;


    public Notification() {
    }

    public Notification(String userImage, String title, String description, String shortDescription
            , String date, String serviceUid, String hallUid, String userUid, String notificationType
            , boolean status, boolean seen) {
        this.userImage = userImage;
        this.title = title;
        this.description = description;
        this.shortDescription = shortDescription;
        this.date = date;
        this.serviceUid = serviceUid;
        this.hallUid = hallUid;
        this.userUid = userUid;
        this.notificationType = notificationType;
        this.status = status;
        this.seen = seen;
    }

    public String getHallUid() {
        return hallUid;
    }

    public void setHallUid(String hallUid) {
        this.hallUid = hallUid;
    }

    public String getServiceUid() {
        return serviceUid;
    }

    public void setServiceUid(String serviceUid) {
        this.serviceUid = serviceUid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}