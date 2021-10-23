package com.example.glicocare;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BluetoothCheck extends AppCompatActivity {

    protected BluetoothAdapter btfAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_check);

//        btfAdaptador = BluetoothAdapter.getDefaultAdapter();

//        if (btfAdaptador == null) {
//            Toast.makeText(this, "Bluetooth não está disponível", Toast.LENGTH_LONG).show();
//            finish();
//        }
//
//        if (btfAdaptador.isEnabled()) {
//            Toast.makeText(this, "Bluetooth está ligado", Toast.LENGTH_LONG).show();
//        }else{
//            Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//            startActivityForResult(intent, 0);
//        }
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (btfAdaptador == null) {
//            Toast.makeText(this, "Bluetooth foi ligado!", Toast.LENGTH_LONG).show();
//        }
//    }
}