package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log Inicial
        Log.d("MainActivity", "App inicializado!!");

        //Obj
        Button btnCliqueAqui = findViewById(R.id.btn_cliqueaqui);
        EditText editNome = findViewById(R.id.edit_nome);

        //Configurando as ações apos apertar o botão.
        View.OnClickListener btnButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getNome = editNome.getText().toString();
                //Conferindo quantidade de letras no campo
                if(editNome.getText().length() != 0){
                    //Caso a quantidade seja maior que 0 aparecer essas linhas de cods.
                    Toast.makeText(MainActivity.this, "Olá " + getNome + ", Bem Vindo!!", Toast.LENGTH_LONG).show();
                }else{
                    //Caso a quantidade seja = 0 aparecer error na log e tela.
                    Log.e("MainActivity", "Error: Campo de Nome Vazio!!");
                    Toast.makeText(MainActivity.this,"Error: Campo de Nome Vazio!!", Toast.LENGTH_LONG).show();
                }
            }
        };
        btnCliqueAqui.setOnClickListener(btnButton);
    }
}