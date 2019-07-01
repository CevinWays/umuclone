package com.cevin.umuclone.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.cevin.umuclone.MainActivity;
import com.cevin.umuclone.R;
import com.cevin.umuclone.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button buttonReg = findViewById(R.id.btn_reg);
        TextView textViewRegtoLogin = findViewById(R.id.btn_to_login);

        textViewRegtoLogin.setOnClickListener(this);
        buttonReg.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn_reg:
                intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_to_login:
                intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
        }
    }
}
