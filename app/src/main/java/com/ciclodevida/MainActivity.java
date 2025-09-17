package com.ciclodevida;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textViewLog = findViewById(R.id.textViewLog);


        if (CicloDeVida.podeDizerOvalor()) {
            x = CicloDeVida.digaOvalor();
        }

        CicloDeVida = CicloDeVida.getInstance();
        cicloDeVida.registraEstado(msg"onCreate, x = " + x);
        mostraConteudo();



    }

    private void mostraConteudo() {
        textViewLog.setText(cicloDeVida)
    }
}