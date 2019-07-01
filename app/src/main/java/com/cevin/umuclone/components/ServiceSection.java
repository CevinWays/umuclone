package com.cevin.umuclone.components;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.cevin.umuclone.R;

public class ServiceSection extends AppCompatActivity {

//    private GridView gridViewService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.component_service_card);

//        gridViewService = findViewById(R.id.gridView);
//        gridViewService.setAdapter(new ServiceSectionAdapter(this));

    }
}


