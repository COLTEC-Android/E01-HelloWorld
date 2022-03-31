package br.ufmg.coltec.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView lblHellodroid=findViewById(R.id.hello_droid);
        final EditText txtName= findViewById(R.id.text_name);
        Button btnUpdade=findViewById(R.id.btn_update);

        btnUpdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome=txtName.getText().toString();
                if(nome.equals("")){
                    lblHellodroid.setText("Digite seu nome!");
                }else{
                    lblHellodroid.setText("Hello, "+txtName.getText());
                }
            }
        });
    }
}