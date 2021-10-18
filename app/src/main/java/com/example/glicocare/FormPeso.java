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

public class FormPeso extends AppCompatActivity {

    private EditText edit_peso;
    private Button bt_adicionar;
    private ListView lista_peso;
    ArrayList<Integer> lista;
    ArrayAdapter<Integer> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_peso);
        getSupportActionBar().hide();
        IniciarComponentes();

        lista = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        lista_peso.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int numero = Integer.parseInt(edit_peso.getText().toString());
                    lista.add(numero);
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    Toast.makeText(FormPeso.this, "Insira um valor para ser adicionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void IniciarComponentes(){
        bt_adicionar = findViewById(R.id.bt_adicionar);
        edit_peso = findViewById(R.id.edit_peso);
        lista_peso = findViewById(R.id.list);
    }
}