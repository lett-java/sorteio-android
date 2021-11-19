package com.flettieri.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTextoExibicao(View view) {
        TextView texto = findViewById(R.id.textoExibicao);
        Random gerador = new Random();


        texto.setText("O número selecionado é: " + gerador.nextInt(11));
    }
}