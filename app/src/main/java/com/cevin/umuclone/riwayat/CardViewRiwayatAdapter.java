package com.cevin.umuclone.riwayat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;
import com.cevin.umuclone.riwayat.model.ModelRiwayat;

import java.util.ArrayList;

public class CardViewRiwayatAdapter extends RecyclerView.Adapter<CardViewRiwayatAdapter.CardViewViewHolder> {
    Context context;
    private ArrayList<ModelRiwayat> listRiwayat;

    public ArrayList<ModelRiwayat> getListRiwayat() {
        return listRiwayat;
    }

    public void setListRiwayat(ArrayList<ModelRiwayat> listRiwayat) {
        this.listRiwayat = listRiwayat;
    }

    public CardViewRiwayatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewRiwayatAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_riwayat, viewGroup, false);

        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewRiwayatAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        ModelRiwayat m = getListRiwayat().get(i);

        cardViewViewHolder.textViewTotal.setText(m.getRiwayatTotal());
        cardViewViewHolder.textViewDesc.setText(m.getRiwayatDesc());
    }

    @Override
    public int getItemCount() {
        return getListRiwayat().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{

        TextView textViewTotal;
        TextView textViewDesc;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTotal = itemView.findViewById(R.id.textView_total_riwayat);
            textViewDesc = itemView.findViewById(R.id.textView_desc_riwayat);
        }
    }
}
