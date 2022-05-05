package com.example.controlwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = (EditText) findViewById(R.id.txtWeb);
    }



    public void ir(View view) {
        Intent intent = new Intent(this,ActivityWeb.class);
        intent.putExtra("SitioWeb", url.getText().toString());
        startActivity(intent);
    }
}