package com.cevin.umuclone.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cevin.umuclone.R;

public class RiwayatFragment extends Fragment {

    TextView textViewToolbar;

    public RiwayatFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_riwayat, container, false);

        textViewToolbar = view.findViewById(R.id.textView_toolbar);
        textViewToolbar.setText("Riwayat");

        return view;
    }
}
