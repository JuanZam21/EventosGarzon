package com.juandiego.eventosgarzon;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {

    private EditText alEtEmail ;
    private EditText alEtPassword;
    private Button  alBtnSingin;

    private String email="";
    private String password="";

    private FirebaseAuth Auth;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Auth=FirebaseAuth.getInstance();
        alEtEmail=(EditText) findViewById(R.id.alEtEmail);
        alEtPassword=(EditText) findViewById(R.id.alEtPassword);
        alBtnSingin=(Button) findViewById(R.id.alBtnSingin);





alBtnSingin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        email=alEtEmail.getText().toString();
        password=alEtPassword.getText().toString();

        if (!email.isEmpty() && !password.isEmpty()){
            loginUser();
        }else {
            Toast.makeText(LoginActivity.this, "Complete los campos", Toast.LENGTH_SHORT).show();
        }
    }
});
    }
private void loginUser(){

Auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
    @Override
    public void onComplete(@NonNull Task<AuthResult> task) {
        if (task.isSuccessful()){
            startActivity(new Intent(LoginActivity.this, AdminActivity.class));
            finish();
        }else {
            Toast.makeText(LoginActivity.this, "No se pudo ingresar, revise los datos", Toast.LENGTH_SHORT).show();
        }
    }
});

}
}







