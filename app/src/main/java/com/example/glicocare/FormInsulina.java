package com.example.glicocare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormInsulina extends AppCompatActivity {

    private EditText edit_insulina;
    private Button bt_adicionar;
    private ListView lista_insulina;
    List<String> lista;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_insulina);
        getSupportActionBar().hide();
        IniciarComponentes();

        lista = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        lista_insulina.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String texto = String.valueOf(edit_insulina.getText());
                    lista.add(texto);
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    Toast.makeText(FormInsulina.this, "Insira um valor para ser adicionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void IniciarComponentes() {
        bt_adicionar = findViewById(R.id.bt_adicionar);
        edit_insulina = findViewById(R.id.edit_insulina);
        lista_insulina = findViewById(R.id.list);
    }
}