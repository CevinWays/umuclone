package com.cevin.umuclone.profile;

import com.cevin.umuclone.profile.model.ModelProfile;

import java.util.ArrayList;

public class SettingsProfileData {
    public static String[][] dataSettings = new String[][]{
            {"Edit Profile"},
            {"Ganti Password"},
            {"Ganti PIN"},
            {"Ganti Nomor"},
    };

    public static ArrayList<ModelProfile> getListData(){
        ModelProfile modelProfile = null;
        ArrayList<ModelProfile> list = new ArrayList<>();
        for (String[] aData : dataSettings){
            modelProfile = new ModelProfile();
            modelProfile.setSettingsName(aData[0]);

            list.add(modelProfile);
        }
        return list;

    }
}
