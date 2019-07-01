package com.cevin.umuclone.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.cevin.umuclone.R;
import com.cevin.umuclone.components.ServiceSectionAdapter;

public class HomeFragment extends Fragment {
    GridView gridView;

    private int[] dataGambar = {R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,
            R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,};

    private String[] dataTitle = {"Alram", "Android", "Mobile", "Website", "Profile", "WordPress","Alram", "Android"};

    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ServiceSectionAdapter serviceSectionAdapter = new ServiceSectionAdapter(getContext(),dataGambar,dataTitle);

        gridView = view.findViewById(R.id.gridView);
        gridView.setAdapter(serviceSectionAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "GridView Item: " + dataTitle[+position], Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
