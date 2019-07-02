package com.cevin.umuclone.riwayat;

import com.cevin.umuclone.riwayat.model.ModelRiwayat;

import java.util.ArrayList;

public class RiwayatData {

    public static String[][] dataRiwayat = new String[][]{
            {"Rp 15.000","Pembayaran Listrik"},
            {"Rp 40.000","Pembayaran Telepon"},
            {"Rp 350.000","Pembayaran Spp"},
            {"Rp 150.000","Pembayaran Pulsa"},
            {"Rp 100.000","Pembayaran Donasi"},
            {"Rp 50.000","Pembayaran PDAM"},
            {"Rp 40.000","Pembayaran Telepon"},
            {"Rp 350.000","Pembayaran Spp"},
            {"Rp 150.000","Pembayaran Pulsa"},
            {"Rp 100.000","Pembayaran Donasi"},
    };

    public static ArrayList<ModelRiwayat> getListData(){
        ModelRiwayat modelRiwayat = null;
        ArrayList<ModelRiwayat> list = new ArrayList<>();
        for(String[] aData : dataRiwayat){
            modelRiwayat = new ModelRiwayat();
            modelRiwayat.setRiwayatTotal(aData[0]);
            modelRiwayat.setRiwayatDesc(aData[1]);

            list.add(modelRiwayat);
        }
        return list;
    }
}
