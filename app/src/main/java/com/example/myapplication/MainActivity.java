package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText editUserName = findViewById(R.id.userName);
        EditText editPassword = findViewById(R.id.password);
        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v-> {
            String username = editUserName.getText().toString().trim();
            String password = editPassword.getText().toString().trim();

            if(username.equals("administrador") && password.equals("123")) {
                Intent intent = new Intent(MainActivity.this, TelaInicial.class);
                startActivity(intent);
            } else if (username.equals("paciente") && password.equals("123")) {

                Intent intent = new Intent(MainActivity.this, TelaDeDadosDoPaciente.class);
                startActivity(intent);

        }else{
                Toast.makeText(this, "Usuário e senha incorretos!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}