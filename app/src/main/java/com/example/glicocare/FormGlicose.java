package com.example.glicocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FormGlicose extends AppCompatActivity {
//public class FormGlicose extends AppCompatActivity implements View.OnClickListener {

//    private Button btVerificar;
    private EditText edit_glico;
    private Button bt_adicionar;
    private ListView lista_glico;
    List<String> lista;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_glicose);
        getSupportActionBar().hide();

        IniciarComponentes();

        lista = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        lista_glico.setAdapter(adapter);

        bt_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String texto = String.valueOf(edit_glico.getText());
                    lista.add(texto);
                    adapter.notifyDataSetChanged();
                }catch (Exception e){
                    Toast.makeText(FormGlicose.this, "Insira um valor para ser adicionado", Toast.LENGTH_SHORT).show();
                }
            }
        });

//        btVerificar = (Button) findViewById(R.id.bt_bluetooh);
//        btVerificar.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.bt_bluetooh:
//                Intent intentCheckBluetooth = new Intent(this, BluetoothCheck.class);
//                startActivity(intentCheckBluetooth);
//        }
//    }

    private void IniciarComponentes() {
        bt_adicionar = findViewById(R.id.bt_adicionar);
        edit_glico = findViewById(R.id.edit_glico);
        lista_glico = findViewById(R.id.list);
    }

}