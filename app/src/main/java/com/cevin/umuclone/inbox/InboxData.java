package com.cevin.umuclone.inbox;

import com.cevin.umuclone.inbox.model.ModelInbox;

import java.util.ArrayList;

public class InboxData {
    public static String[][] dataInbox = new String[][]{
            {"Bokek Hari ini?, Cek Promo UMU !","Ada promo UMU nih, yuk di cek!"},
            {"Horey Payday?","Bagi kamu yang gajian ada promo nih!"},
            {"Mau Kemana Hari ini?","Yuk top up dulu sebelum jalan!"},
            {"Laper Baper?","Gausah takut, Umu tetap menemanimu!"},
            {"Selamat Kamu Dapat Stempel lagi!","Cek disini!"},
            {"Bokek Hari ini?, Cek Promo UMU !","Ada promo UMU nih, yuk di cek!"},
            {"Horey Payday?","Bagi kamu yang gajian ada promo nih!"},
            {"Mau Kemana Hari ini?","Yuk top up dulu sebelum jalan!"},
            {"Laper Baper?","Gausah takut, Umu tetap menemanimu!"},
            {"Selamat Kamu Dapat Stempel lagi!","Cek disini!"},

    };

    public static ArrayList<ModelInbox> getListData(){
        ModelInbox modelInbox = null;
        ArrayList<ModelInbox> list = new ArrayList<>();
        for (String[] aData : dataInbox){
            modelInbox = new ModelInbox();
            modelInbox.setMessageTitle(aData[0]);
            modelInbox.setMessageDesc(aData[1]);

            list.add(modelInbox);
        }
        return list;

    }
}
