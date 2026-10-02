package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class historicodeexames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.historicodeexames);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Bottom Nav: Início -> TelaDeDadosDoAdministrador
        LinearLayout navInicio = findViewById(R.id.navInicio);
        if (navInicio != null) {
            navInicio.setOnClickListener(v -> {
                Intent intent = new Intent(historicodeexames.this, TelaDeDadosDoAdministrador.class);
                startActivity(intent);
            });
        }

        // Bottom Nav: Novo Exame -> CadastroDoPaciente
        LinearLayout navNovoExame = findViewById(R.id.navNovoExame);
        if (navNovoExame != null) {
            navNovoExame.setOnClickListener(v -> {
                Intent intent = new Intent(historicodeexames.this, CadastroDoPaciente.class);
                startActivity(intent);
            });
        }
    }
}
