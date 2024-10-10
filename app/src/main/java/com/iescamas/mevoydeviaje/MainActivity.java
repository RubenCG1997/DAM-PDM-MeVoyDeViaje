package com.iescamas.mevoydeviaje;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String dest="",transp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializamos el texto que debe salir al principio según el botón que esté seleccionado
        int marcaGrupo1 = ((RadioGroup) findViewById(R.id.rg_Opciones1)).getCheckedRadioButtonId();
        dest = marcaGrupo1 !=-1 ? ((RadioButton) findViewById(marcaGrupo1)).getText().toString() : "No se marco ningún boton";
        //Inicializamos el texto que debe salir al principio según el botón que esté seleccionado
        int marcaGrupo2 = ((RadioGroup) findViewById(R.id.rg_Opciones2)).getCheckedRadioButtonId();
        transp = marcaGrupo2!=-1 ? ((RadioButton)findViewById(marcaGrupo2)).getText().toString() : "No se marco ningun botón";
        //Comprobamos si se ha realizado algún cambio en el grupo 1
        ((RadioGroup) findViewById(R.id.rg_Opciones1)).setOnCheckedChangeListener((radioGroup,i)-> {
            dest = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
        });
        //Comprobamos si se ha realizado algún cambio en el grupo 2
        ((RadioGroup) findViewById(R.id.rg_Opciones2)).setOnCheckedChangeListener((radioGroup, i) ->  {
            transp = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
        });
        findViewById(R.id.btn_info).setOnClickListener(view ->Toast.makeText(MainActivity.this,"Me voy a "+dest+ " en "+transp,Toast.LENGTH_LONG).show());

    }

}