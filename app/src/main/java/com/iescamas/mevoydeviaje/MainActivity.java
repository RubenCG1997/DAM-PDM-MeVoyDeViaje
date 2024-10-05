package com.iescamas.mevoydeviaje;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    RadioGroup rg_Opciones1,rg_Opciones2;
    RadioButton rb_opcion11,rb_opcion21;
    Button btn_info;
    String dest="",transp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg_Opciones1 = findViewById(R.id.rg_Opciones1);
        rg_Opciones2 = findViewById(R.id.rg_Opciones2);
        rb_opcion11 = findViewById(R.id.rb_Opciones11);
        rb_opcion21 = findViewById(R.id.rb_Opcion21);
        btn_info = findViewById(R.id.btn_info);

        //Al iniciar tanto la opcion11 como opcion21 le asignamos a la variables su valor
        dest=rb_opcion11.getText().toString();
        transp=rb_opcion21.getText().toString();

        //Comprobamos si se ha realizado algún cambio en el grupo 1
        rg_Opciones1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                    dest = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
            }
        });
        //Comprobamos si se ha realizado algún cambio en el grupo 2
        rg_Opciones2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                    transp = ((RadioButton) radioGroup.findViewById(i)).getText().toString();
            }
        });

        btn_info.setOnClickListener(view ->Toast.makeText(MainActivity.this,"Me voy a "+dest+ " en "+transp,Toast.LENGTH_LONG).show());

    }

}