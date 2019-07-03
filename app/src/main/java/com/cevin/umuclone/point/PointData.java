package com.cevin.umuclone.point;

import com.cevin.umuclone.point.model.ModelPoint;

import java.util.ArrayList;

public class PointData {
    public static String[][] dataInbox = new String[][]{
            {"Reward Point 1","Redeem Untuk Menggunakan"},
            {"Reward Point 2","Redeem Untuk Menggunakan"},
            {"Reward Point 3","Redeem Untuk Menggunakan"},
            {"Reward Point 4","Redeem Untuk Menggunakan"},
            {"Reward Point 5","Redeem Untuk Menggunakan"},
            {"Reward Point 6","Redeem Untuk Menggunakan"},
            {"Reward Point 7","Redeem Untuk Menggunakan"},
            {"Reward Point 8","Redeem Untuk Menggunakan"},

    };

    public static ArrayList<ModelPoint> getListData(){
        ModelPoint modelPoint = null;
        ArrayList<ModelPoint> list = new ArrayList<>();
        for (String[] aData : dataInbox){
            modelPoint = new ModelPoint();
            modelPoint.setMessageTitle(aData[0]);
            modelPoint.setMessageDesc(aData[1]);

            list.add(modelPoint);
        }
        return list;

    }
}
