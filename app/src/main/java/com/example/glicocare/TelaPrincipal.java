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
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF6347")));
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

}