package com.example.glicocare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FormCadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
    }
}