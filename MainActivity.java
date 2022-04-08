package com.uca.examen_cdjd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        RadioButton opcion1, opcion2, opcion3;
        TextView numeropregunta, pregunta;
        Button siguiente, atras;
    int diagnostico = 0; int quepregunta = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcion1 = (RadioButton)findViewById(R.id.respuesta1);
        opcion2 = (RadioButton)findViewById(R.id.respuesta2);
        opcion3 = (RadioButton)findViewById(R.id.respuesta3);

        numeropregunta = (TextView)findViewById(R.id.numeropregunta);
        pregunta = (TextView)findViewById(R.id.pregunta);

        siguiente = (Button)findViewById(R.id.siguiente);
        atras = (Button)findViewById(R.id.atras);
    }

    public void siguiente (View v) {

        if (opcion1.isChecked() == false && opcion2.isChecked() == false && opcion3.isChecked() == false) {
            Toast.makeText(this, "Escoje la opcion y acabalo", Toast.LENGTH_SHORT).show();
        } else if (quepregunta == 1) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 1;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 2");
            pregunta.setText("diferencias de atributo y metodo");
            opcion1.setText("es lo mismo");
            opcion2.setText("uno es caracteristica y otro son las intrucciones");
            opcion3.setText("es de otra materia");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        } else if (quepregunta == 2) {

            if (opcion2.isChecked()) {
                diagnostico = diagnostico + 1;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 3");
            pregunta.setText("que es una clase");
            opcion1.setText("son plantillas para la creacion de un metodo");
            opcion2.setText("una aplicacion ");
            opcion3.setText("son plantillas para la creacion de un objeto");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        } else if (quepregunta == 3) {

            if (opcion3.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 4");
            pregunta.setText("proceso de definir los atributos y metodos de una clase");
            opcion1.setText("abstaccion");
            opcion2.setText("herencia");
            opcion3.setText("polimorfismo");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        } else if (quepregunta == 4) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 5");
            pregunta.setText("las clases hijo mantienen caracteristicas de las clases padre");
            opcion1.setText("polimorfismo");
            opcion2.setText("herencia");
            opcion3.setText("encapsulaminto");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        } else if (quepregunta == 5) {

            if (opcion2.isChecked()) {
                diagnostico = diagnostico + 2;
            }

            quepregunta = quepregunta + 1;

            numeropregunta.setText("Pregunta 6");
            pregunta.setText("proteje la informacion de manipulaciones no autorizadas");
            opcion1.setText("encapsulamiento");
            opcion2.setText("abstraccion");
            opcion3.setText("CRUD");

            opcion1.setChecked(true);
            opcion2.setChecked(false);
            opcion3.setChecked(false);
        } else if (quepregunta == 6) {

            if (opcion1.isChecked()) {
                diagnostico = diagnostico + 2;
            }


            numeropregunta.setText("te dire si aprpbaste o no " +      diagnostico);

            if (diagnostico >= 6) {
                pregunta.setText("Usted Aprobo FELICIDADES!!!!");
            } else {
                pregunta.setText("Usted Reprobo ESTUDIE");
            }

            opcion1.setVisibility(View.GONE);
            opcion2.setVisibility(View.GONE);
            opcion3.setVisibility(View.GONE);
            siguiente.setVisibility(View.GONE);
        }

    }
    public void Salir(View v){
        finish();
    }
}











