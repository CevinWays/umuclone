package com.cevin.umuclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.cevin.umuclone.components.ServiceSectionAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    private int[] dataGambar = {R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,
            R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,};

    private String[] dataTitle = {"Alram", "Android", "Mobile", "Website", "Profile", "WordPress","Alram", "Android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ServiceSectionAdapter serviceSectionAdapter = new ServiceSectionAdapter(MainActivity.this,dataGambar,dataTitle);

        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(serviceSectionAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "GridView Item: " + dataTitle[+position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
