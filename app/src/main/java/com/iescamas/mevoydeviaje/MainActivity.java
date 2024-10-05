package com.iescamas.mevoydeviaje;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton rb_PrimerDestino,rb_SegundoDestino,rb_TercerDestino;
    RadioButton rb_PrimerTransporte,rb_SegundoTransporte,rb_TercerTransporte;
    Button btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb_PrimerDestino = findViewById(R.id.rb_Primer_Destino);
        rb_SegundoDestino = findViewById(R.id.rb_Segundo_Destino);
        rb_TercerDestino = findViewById(R.id.rb_Tercer_Destino);
        rb_PrimerTransporte = findViewById(R.id.rb_Primer_Transporte);
        rb_SegundoTransporte = findViewById(R.id.rb_Segundo_Transporte);
        rb_TercerTransporte = findViewById(R.id.rb_Tercer_Transporte);
        btn_info = findViewById(R.id.btn_info);

        btn_info.setOnClickListener(view -> MostrarToast());

    }
    private void MostrarToast(){

        String dest = "",transp = "";
        if(rb_PrimerDestino.isChecked() && rb_PrimerTransporte.isChecked()){
            dest = rb_PrimerDestino.getText().toString();
            transp = rb_PrimerTransporte.getText().toString();
        } else if (rb_PrimerDestino.isChecked() && rb_SegundoTransporte.isChecked()) {
            dest = rb_PrimerDestino.getText().toString();
            transp = rb_SegundoTransporte.getText().toString();
        } else if (rb_PrimerDestino.isChecked() && rb_TercerTransporte.isChecked()) {
            dest = rb_PrimerDestino.getText().toString();
            transp = rb_TercerTransporte.getText().toString();
        } else if (rb_SegundoDestino.isChecked() && rb_PrimerTransporte.isChecked()) {
            dest = rb_SegundoDestino.getText().toString();
            transp = rb_PrimerTransporte.getText().toString();
        } else if (rb_SegundoDestino.isChecked() && rb_SegundoTransporte.isChecked()) {
            dest = rb_SegundoDestino.getText().toString();
            transp = rb_SegundoTransporte.getText().toString();
        } else if (rb_SegundoDestino.isChecked() && rb_TercerTransporte.isChecked()) {
            dest = rb_SegundoDestino.getText().toString();
            transp = rb_TercerTransporte.getText().toString();
        } else if (rb_TercerDestino.isChecked() && rb_PrimerTransporte.isChecked()) {
            dest = rb_TercerDestino.getText().toString();
            transp = rb_PrimerTransporte.getText().toString();
        } else if (rb_TercerDestino.isChecked() && rb_SegundoTransporte.isChecked()) {
            dest = rb_TercerDestino.getText().toString();
            transp = rb_SegundoTransporte.getText().toString();
        }  else if (rb_TercerDestino.isChecked() && rb_TercerTransporte.isChecked()) {
            dest = rb_TercerDestino.getText().toString();
            transp = rb_TercerTransporte.getText().toString();
        }

        if(dest.isEmpty() || transp.isEmpty()){
            Toast.makeText(MainActivity.this,"Faltan campos por seleccionar",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Me voy a "+dest+ " en "+transp,Toast.LENGTH_LONG).show();
        }
    }
}