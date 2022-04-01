package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"App inicializado!");

        final TextView lblHellodroid=findViewById(R.id.hello_droid);
        final EditText txtName= findViewById(R.id.text_name);
        Button btnUpdade=findViewById(R.id.btn_update);

        btnUpdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome=txtName.getText().toString();
                if(nome.equals("")){
                    Log.e(TAG,"Campo vazio!");
                    lblHellodroid.setText("Digite seu nome!");
                }else{
                    lblHellodroid.setText("Hello, "+txtName.getText());
                }
            }
        });
    }
}