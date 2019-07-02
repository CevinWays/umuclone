package com.cevin.umuclone.inbox.model;

import android.os.Parcelable;

public class ModelInbox{

    private String messageTitle,messageDesc;

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }
}
