**Bateria**
Para realizar o monitoramento da bateria através do Android Studio utiliza-se a classe
Intent que recebe todos os dados possíveis pela classe BatteryManager, é possível verificar se a bateria
está sendo carregada no momento pela função *batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1)* e até o 
modo pelo qual está sendo carregada pela função *batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1)*

**GPS**
Para ter o controle do GPS durante o uso do aplicativo, primeiro, é necessário pedir a permissão do usuario para
ativar a localização do dispositivo com o aplicativo pelo manifesto *<uses-permission android:name="android.permission.ACCESS_BACKGROUND_LOCATION"*
tendo vários níveis de acesso a localização, sendo aproximada ou exata, e durante todo o uso do aplicativo ou somente durante sua execução.
Utilizando as funções *getLastLocation()* e *getCurrentLocation()* é possível obter os dados do aparelho e utilizá-los no app.

**Ligacao**
Para efetuar uma ligação também é necessário a permissão do usuário que é dada pelo manifesto *<uses-permission android:name="android.permission.CALL_PHONE"/>*
Para conseguir fazer uma ligacao pelo aplicativo é utilizado a classe Intent com as funções 
*Uri uri = Uri.parse("tel:"+telefone);
Intent intent = new Intent(Intent.ACTION_DIAL,uri);
startActivity(intent);*


