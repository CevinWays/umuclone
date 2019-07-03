package com.cevin.umuclone.point;

import com.cevin.umuclone.point.model.ModelPoint;

import java.util.ArrayList;

public class PointData {
    public static String[][] dataInbox = new String[][]{
            {"Reward Point 1","Valid until 21 Jul 2019"},
            {"Reward Point 2","Valid until 18 Okt 2019"},
            {"Reward Point 3","Valid until 12 Jul 2019"},
            {"Reward Point 4","Valid until 09 Jul 2019"},
            {"Reward Point 5","Valid until 21 Jun 2019"},
            {"Reward Point 6","Valid until 01 Jul 2019"},
            {"Reward Point 7","Valid until 02 Jan 2019"},
            {"Reward Point 8","Valid until 28 Jul 2019"},

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
