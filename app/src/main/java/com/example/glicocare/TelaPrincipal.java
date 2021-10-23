package com.example.glicocare;

import static com.example.glicocare.R.menu.menu_tela_principal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TelaPrincipal extends AppCompatActivity {

    private ImageButton bt_glicose, bt_alimentacao, bt_medicacao, bt_peso, bt_atividade, bt_insulina, bt_download, bt_grafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF6347")));
        IniciarComponentes();

        bt_glicose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this, FormGlicose.class);
                startActivity(intent);
            }
        });

        bt_alimentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,FormAlimentacao.class);
                startActivity(intent);
            }
        });

        bt_medicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,FormMedicacao.class);
                startActivity(intent);
            }
        });

        bt_peso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,FormPeso.class);
                startActivity(intent);
            }
        });

        bt_atividade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,FormExercicios.class);
                startActivity(intent);
            }
        });

        bt_insulina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,FormInsulina.class);
                startActivity(intent);
            }
        });

        bt_grafico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPrincipal.this,Glicose.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(menu_tela_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()){
            case R.id.itemPerfil:
                TelaPerfil();
                return true;
            case R.id.itemHelp:
                TelaHelp();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void TelaPerfil(){
        FirebaseUser usuarioAtual = FirebaseAuth.getInstance().getCurrentUser();

        Intent intent = new Intent(TelaPrincipal.this, PerfilPaciente.class);
        startActivity(intent);
    }

    private void TelaHelp(){
        Intent intent = new Intent(TelaPrincipal.this, Help.class);
        startActivity(intent);
    }

    private void IniciarComponentes(){
        bt_glicose = findViewById(R.id.bt_glicose);
        bt_alimentacao = findViewById(R.id.bt_food);
        bt_medicacao = findViewById(R.id.bt_med);
        bt_peso = findViewById(R.id.bt_peso);
        bt_atividade = findViewById(R.id.bt_sports);
        bt_insulina = findViewById(R.id.bt_insulina);
        bt_download = findViewById(R.id.bt_download);
        bt_grafico = findViewById(R.id.bt_grafico);
    }

}