package com.cevin.umuclone.welcome;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cevin.umuclone.login.LoginActivity;
import com.cevin.umuclone.R;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout;
    private Button buttonGetStarted;
    private int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ViewPager slideViewPager = findViewById(R.id.slideViewPager);
        linearLayout = findViewById(R.id.dotsLayout);
        buttonGetStarted = findViewById(R.id.button_getStarted);

        SliderWelcomeAdapter sliderWelcomeAdapter = new SliderWelcomeAdapter(this);
        slideViewPager.setAdapter(sliderWelcomeAdapter);

        buttonGetStarted.setOnClickListener(this);

        addDotsIndicator(0);

        slideViewPager.addOnPageChangeListener(viewListener);
    }

    private void addDotsIndicator(int position) {
        TextView[] mDots = new TextView[3];
        linearLayout.removeAllViews();

        for (int i=0; i< mDots.length;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorGrey));

            linearLayout.addView(mDots[i]);
        }

        mDots[position].setTextColor(getResources().getColor(R.color.colorAccent));

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_getStarted){
            Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);
            currentPage = position;

            if (currentPage == 0){
                buttonGetStarted.setEnabled(true);
                buttonGetStarted.setVisibility(View.VISIBLE);
            }else if (currentPage == 2){
                buttonGetStarted.setEnabled(true);
                buttonGetStarted.setVisibility(View.VISIBLE);
            }else{
                buttonGetStarted.setEnabled(true);
                buttonGetStarted.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
