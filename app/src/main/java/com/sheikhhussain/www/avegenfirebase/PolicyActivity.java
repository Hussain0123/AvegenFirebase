package com.sheikhhussain.www.avegenfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PolicyActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_agree,btn_notagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn_agree=findViewById(R.id.btn_agree);
        btn_notagree=findViewById(R.id.btn_notagree);

        btn_agree.setOnClickListener(this);
        btn_notagree.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v==btn_agree)
            startActivity(new Intent(this, SignupActivity.class));
        else
            Toast.makeText(this,"You have to First Agree Policy for Signup ",Toast.LENGTH_SHORT).show();


    }
}
