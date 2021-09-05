package com.example.glicocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FormTipoUsuario extends AppCompatActivity {

    private ImageButton bt_paciente,bt_profissional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tipo_usuario);

        getSupportActionBar().hide();
        IniciarComponentes();

        bt_paciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormTipoUsuario.this,FormCadastro.class);
                startActivity(intent);
                finish();
            }
        });

        bt_profissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormTipoUsuario.this,FormCadastroProfissional.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void IniciarComponentes(){
        bt_paciente = findViewById(R.id.bt_paciente);
        bt_profissional = findViewById(R.id.bt_profissional);
    }
}