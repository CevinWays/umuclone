package com.cevin.umuclone.welcome;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cevin.umuclone.R;

public class SliderWelcomeAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    public SliderWelcomeAdapter(Context context) {
        this.context = context;
    }

    private int[] slide_images = {
            R.mipmap.slide1,
            R.mipmap.slide2,
            R.mipmap.slide3,
    };

    private String[] slide_headings = {
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet",
            "Lorem ipsum dolor sit amet"
    };

    private String[] slide_desc = {
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slide_welcome, container, false);

        ImageView imageView = view.findViewById(R.id.slide_image);
        TextView textViewHead = view.findViewById(R.id.slide_heading);
        TextView textViewDesc = view.findViewById(R.id.slide_desc);

        imageView.setImageResource(slide_images[position]);
        textViewHead.setText(slide_headings[position]);
        textViewDesc.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
