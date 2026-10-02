package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaDeDadosDoAdministrador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_de_dados_do_admnistrador);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Botão Fechar (×) -> Retornar para TelaInicial
        TextView btnClose = findViewById(R.id.btnClose);
        if (btnClose != null) {
            btnClose.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, TelaInicial.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            });
        }

        // Fundo Verde (Gerar Novo QR Code) -> CadastroDoPaciente
        LinearLayout fundoVerde = findViewById(R.id.fundoVerde);
        if (fundoVerde != null) {
            fundoVerde.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, CadastroDoPaciente.class);
                startActivity(intent);
            });
        }

        // Ver todos -> historicodeexames
        TextView txtVerTodos = findViewById(R.id.txtVerTodos);
        if (txtVerTodos != null) {
            txtVerTodos.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, historicodeexames.class);
                startActivity(intent);
            });
        }

        // Bottom Nav: Histórico
        LinearLayout navHistorico = findViewById(R.id.navHistorico);
        if (navHistorico != null) {
            navHistorico.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, historicodeexames.class);
                startActivity(intent);
            });
        }

        // Bottom Nav: Novo Exame
        LinearLayout navNovoExame = findViewById(R.id.navNovoExame);
        if (navNovoExame != null) {
            navNovoExame.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, CadastroDoPaciente.class);
                startActivity(intent);
            });
        }

        // Bottom Nav: Início -> TelaInicial
        LinearLayout navInicio = findViewById(R.id.navInicio);
        if (navInicio != null) {
            navInicio.setOnClickListener(v -> {
                Intent intent = new Intent(TelaDeDadosDoAdministrador.this, TelaInicial.class);
                startActivity(intent);
            });
        }
    }
}
