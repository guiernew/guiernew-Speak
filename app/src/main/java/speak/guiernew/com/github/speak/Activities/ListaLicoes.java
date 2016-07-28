package speak.guiernew.com.github.speak.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import speak.guiernew.com.github.speak.Controle.DownloadLicao;
import speak.guiernew.com.github.speak.R;

public class ListaLicoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_licoes);


        //new DownloadLicao().execute("");
    }
}
