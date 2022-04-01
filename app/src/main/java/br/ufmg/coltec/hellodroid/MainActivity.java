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

        but1.setOnClickListener((view) ->{
            String str = "Olá, " + txt.getText().toString();
            if(str.equals("Olá, ")){
                Toast.makeText(this, "Campo vazio", Toast.LENGTH_LONG).show();
                Log.e("MainActivity","Campo vazio.");
            }
            else if(str.equals("Olá, Digite seu nome aqui"))
                Toast.makeText(this, "Você não alterou o seu nome.", Toast.LENGTH_LONG).show();

            else
                Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        });
    }
}/***Bateria**
 Para realizar o monitoramento da bateria através do Android Studio utiliza-se a classe
 Intent que recebe todos os dados possíveis pela classe BatteryManager, é possível verificar se a bateria
 está sendo carregada no momento pela função *batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1)* e até o
 modo pelo qual está sendo carregada pela função *batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)*

 **GPS**
 Para ter o controle do GPS durante o uso do aplicativo, primeiro, é necessário pedir a permissão do usuario para
 ativar a localização do dispositivo com o aplicativo pelo manifesto *<uses-permission android:name="android.permission.ACCESS_BACKGROUND_LOCATION"*
 tendo vários níveis de acesso a localização, sendo aproximada ou exata, e durante todo o uso do aplicativo ou somente durante sua execução.

 **Ligacao**


 */