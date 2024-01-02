package com.juandiego.eventosgarzon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;


public class GestadminActivity extends AppCompatActivity {

    private EditText agEtName;
    private EditText agEtLastname;
    private EditText agEtEmail;
    private EditText agEtPassword;
    private EditText agEtRpassword;
    private Button  agBtnRadmin;

    private String name="";
    private String lastname="";
    private String email="";
    private String password="";
    private String rpassword="";

    FirebaseAuth GAAuth;
    DatabaseReference GADatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestadmin);
        GADatabase= FirebaseDatabase.getInstance().getReference();
        GAAuth=FirebaseAuth.getInstance();
        agEtName=(EditText) findViewById(R.id.agEtName);
        agEtLastname=(EditText) findViewById(R.id.agEtLastname);
        agEtEmail=(EditText)findViewById(R.id.agEtEmail);
        agEtPassword=(EditText)findViewById(R.id.agEtPassword);
        agEtRpassword=(EditText)findViewById(R.id.agEtRpassword);
        agBtnRadmin=(Button)findViewById(R.id.agBtnRadmin);
        agBtnRadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            name=agEtName.getText().toString();
            lastname=agEtLastname.getText().toString();
            email=agEtEmail.getText().toString();
            password=agEtPassword.getText().toString();
            rpassword=agEtRpassword.getText().toString();

            if(!name.isEmpty() && !email.isEmpty() && !rpassword.isEmpty() && !lastname.isEmpty() && !password.isEmpty()){
                if (password.length()>5 && rpassword.length()>5 ){
                    if (password.equals(rpassword)){
                        registerUser();
                    }else {
                        Toast.makeText(GestadminActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(GestadminActivity.this, "La contraseña debe tener mas de 5 caracteres", Toast.LENGTH_SHORT).show();
                }

            }else{
                Toast.makeText(GestadminActivity.this, "Por favor llene todos los campos", Toast.LENGTH_SHORT).show();
            }
            }
        });
    }
    private void registerUser(){
        GAAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Map<String, Object> map=new HashMap<>();
                    map.put("name", name);
                    map.put("lastname", lastname);
                    map.put("email", email);
                    map.put("password", password);

                    String id=GAAuth.getCurrentUser().getUid();
                    GADatabase.child("Users").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task2) {
                            if (task2.isSuccessful()) {
                                Toast.makeText(GestadminActivity.this, "Registro guardado exitosamente en la base de datos", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(GestadminActivity.this, GestadminActivity.class));
                                finish();
                            } else {
                                Toast.makeText(GestadminActivity.this, "No se pudo realizar el registro", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });
    }
}
