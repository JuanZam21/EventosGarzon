package com.juandiego.eventosgarzon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class  AdminActivity extends AppCompatActivity {

    private Button aaBtnLogout;
    private Button aaBtnGestadmin;
    private Button aaBtnAddevent;
    private FirebaseAuth Bauth;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        aaBtnGestadmin=(Button) findViewById(R.id.aaBtnGestadmin);
        aaBtnAddevent=(Button) findViewById(R.id.aaBtnAddevent);
        aaBtnLogout=(Button) findViewById(R.id.aaBtnLogout);
        Bauth=FirebaseAuth.getInstance();


        aaBtnGestadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this, GestadminActivity.class));
            }
        });

        aaBtnAddevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this, AddeventActivity.class));
            }
        });

        aaBtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bauth.signOut();
                startActivity(new Intent(AdminActivity.this, LoginActivity.class));
                finish();
            }
        });


    }

}
