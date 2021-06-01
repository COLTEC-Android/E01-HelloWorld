package com.example.hellodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(MainActivity.class.getName(), "App inicializado!");

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                EditText input = (EditText) findViewById(R.id.input);

                if(input != null){
                    Toast toast = Toast.makeText(context, (CharSequence) input, duration);
                    toast.show();
                }else{
                    Log.d(MainActivity.class.getName(), "Erro");
                }

            }
        });
    }
}