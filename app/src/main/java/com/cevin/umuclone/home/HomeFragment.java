package com.cevin.umuclone.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.cevin.umuclone.R;
import com.cevin.umuclone.components.ServiceSectionAdapter;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private GridView gridView;
    private ImageView imageViewMail,imageViewDep1,imageViewDep2,imageViewDep3,imageViewNext;

    private int[] dataGambar = {R.mipmap.ic_donasi,R.mipmap.ic_spp,R.mipmap.ic_pulsa,R.mipmap.ic_telpon,
            R.mipmap.ic_listrik,R.mipmap.ic_pdam,R.mipmap.ic_tabungan,R.mipmap.ic_all};

    private String[] dataTitle = {"Donasi", "Pem. SPP", "Pulsa", "Telepon", "Listrik", "PDAM","Tab. Pend", "Lihat Semua"};

    public HomeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        imageViewMail = view.findViewById(R.id.imageView_inbox_notif);
        imageViewDep1 = view.findViewById(R.id.imageView_dep_1);
        imageViewDep2 = view.findViewById(R.id.imageView_dep_2);
        imageViewDep3 = view.findViewById(R.id.imageView_dep_3);
        imageViewNext = view.findViewById(R.id.imageView_next);

        imageViewMail.setOnClickListener(this);
        imageViewDep1.setOnClickListener(this);
        imageViewDep2.setOnClickListener(this);
        imageViewDep3.setOnClickListener(this);
        imageViewNext.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView_inbox_notif:
                Toast.makeText(getContext(), "Ke detail inbox",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_dep_1:
                Toast.makeText(getContext(), "Ke detail transfer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_dep_2:
                Toast.makeText(getContext(), "Ke detail top up",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_dep_3:
                Toast.makeText(getContext(), "Ke detail deals",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageView_next:
                Toast.makeText(getContext(), "Ke detail wallet",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
