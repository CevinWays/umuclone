package com.cevin.umuclone.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.cevin.umuclone.R;

public class ServiceSectionAdapter extends BaseAdapter {
    private Context context;

//    private int[] dataGambar = {R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,
//            R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,R.drawable.umu_welcome_satu,};
//
//    private String[] dataTitle = {"Alram", "Android", "Mobile", "Website", "Profile", "WordPress","Alram", "Android"};

    private final int[] dataGambar;
    private final String[] dataTitle;

    public ServiceSectionAdapter(Context context, int[] dataGambar, String[] dataTitle) {
        this.context = context;
        this.dataGambar = dataGambar;
        this.dataTitle = dataTitle;
    }

    @Override
    public int getCount() {
        return dataGambar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){
//            imageView = new ImageView(context);
//            imageView.setLayoutParams(new GridView.LayoutParams(180, 180));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
            view = new View(context);
            view = inflater.inflate(R.layout.component_service_card, null);
            TextView textView = (TextView) view.findViewById(R.id.android_gridview_text);
            ImageView imageView = (ImageView) view.findViewById(R.id.android_gridview_image);

            textView.setText(dataTitle[position]);
            imageView.setImageResource(dataGambar[position]);
        }else{
            view = (View) convertView;
        }
        return view;
    }
}
