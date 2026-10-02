package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnBaixarLaudo = findViewById(R.id.btnBaixarLaudo);
        if (btnBaixarLaudo != null) {
            btnBaixarLaudo.setOnClickListener(v -> {
                // Ação do laudo
            });
        }

        TextView txtPortalPaciente = findViewById(R.id.txtPortalPaciente);
        if (txtPortalPaciente != null) {
            txtPortalPaciente.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity4.this, TelaInicial.class);
                startActivity(intent);
            });
        }
    }
}
