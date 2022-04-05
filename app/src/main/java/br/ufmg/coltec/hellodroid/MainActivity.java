package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Aplicativo iniciado.");
        Button but1 = findViewById(R.id.botao);
        EditText txt = findViewById(R.id.txtNome);

        but1.setOnClickListener((view) -> {
            String str = "Olá, " + txt.getText().toString();
            if (str.equals("Olá, ")) {
                Toast.makeText(this, "Campo vazio", Toast.LENGTH_LONG).show();
                Log.e("MainActivity", "Campo vazio.");
            } else if (str.equals("Olá, Digite seu nome aqui"))
                Toast.makeText(this, "Você não alterou o seu nome.", Toast.LENGTH_LONG).show();

            else
                Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        });
    }
}