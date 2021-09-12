package com.example.glicocare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getSupportActionBar().hide();

        ((TextView) findViewById(R.id.text_link)).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) findViewById(R.id.text_link)).setText(Html.fromHtml(getResources().getString(R.string.link_help)));
    }
}