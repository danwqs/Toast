package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast (View view) {

        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource (android.R.drawable.alert_dark_frame);

        Toast.makeText(
                getApplicationContext(),
                "Ação Realizada com sucesso",
                Toast.LENGTH_LONG
        ).show();

    }

}