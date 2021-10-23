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

public class FormExercicios extends AppCompatActivity {

    private EditText edit_sports;
    private Button bt_adicionar;
    private ListView lista_sports;
    List<String> lista;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_exercicios);
        getSupportActionBar().hide();
        IniciarComponentes();

        lista = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        lista_sports.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String texto = String.valueOf(edit_sports.getText());
                    lista.add(texto);
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    Toast.makeText(FormExercicios.this, "Insira um valor para ser adicionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void IniciarComponentes() {
        bt_adicionar = findViewById(R.id.bt_adicionar);
        edit_sports = findViewById(R.id.edit_sports);
        lista_sports = findViewById(R.id.list);
    }
}