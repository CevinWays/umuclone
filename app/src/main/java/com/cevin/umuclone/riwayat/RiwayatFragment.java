package com.cevin.umuclone.riwayat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;
import com.cevin.umuclone.riwayat.model.ModelRiwayat;

import java.util.ArrayList;

public class RiwayatFragment extends Fragment {

    private TextView textViewToolbar;
    private RecyclerView recyclerViewRiwayat;
    private ArrayList<ModelRiwayat> list = new ArrayList<>();


    public RiwayatFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_riwayat, container, false);

        textViewToolbar = view.findViewById(R.id.textView_toolbar);
        recyclerViewRiwayat = view.findViewById(R.id.recycleView_riwayat);

        textViewToolbar.setText("Riwayat");
        list.addAll(RiwayatData.getListData());
        showRecycleCardView();

        Log.d("riwayatfrag", String.valueOf(list));

        return view;
    }

    private void showRecycleCardView() {
        recyclerViewRiwayat.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CardViewRiwayatAdapter cardViewRiwayatAdapter = new CardViewRiwayatAdapter(this.getContext());
        cardViewRiwayatAdapter.setListRiwayat(list);
        recyclerViewRiwayat.setAdapter(cardViewRiwayatAdapter);
    }
}
