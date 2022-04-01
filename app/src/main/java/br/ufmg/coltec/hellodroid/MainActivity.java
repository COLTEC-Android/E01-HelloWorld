package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "App inicializado");


        Button btnOK = findViewById(R.id.btn_ok);
        TextView txtNome = findViewById(R.id.txt_nome);

        btnOK.setOnClickListener((view) -> {
            if (txtNome.getText().length()==0){
                Log.e("MainActivity", "Nenhum nome foi digitado");
            }else{
                Toast.makeText(this, "Olá, " + txtNome.getText(), Toast.LENGTH_LONG).show();
            }

        });
    }
}