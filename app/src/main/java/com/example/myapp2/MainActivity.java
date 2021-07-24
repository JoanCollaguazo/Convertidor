package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText valor;
    private TextView tv1;
    private Spinner spinner;
    private Spinner spinner2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = (EditText) findViewById(R.id.txtValor);
        tv1 = (TextView) findViewById(R.id.tv1);
        spinner = (Spinner) findViewById(R.id.spinnerOpciones);
        spinner2 = (Spinner) findViewById(R.id.spinnerOpciones2);


        //creacion de las opciones para el spinner dentro de un arreglo:
        String[] opciones = {"Kilometros", "Hectometros", "Decametro", "Metros", "Decimetro", "Centimetro", "Milimetro"};
        //usamos un adaptador de tipo String para las opciones
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        //adaptador en el spinner grafico:
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        //PERSONALIZACION de ACTION BAR
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }


    public void mostrar(View view) {
        //ingreso el valor ingresado como variable general:
        double valorIngresado = Double.parseDouble(valor.getText().toString());

        //RECOLECCION DE DATOS DE CADA OBJETO DE LA INTERFAZ:
        String longitudSeleccionado = spinner.getSelectedItem().toString();
        String opcionConversion = spinner2.getSelectedItem().toString();

        //KILOMETROS:
        if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Kilometros")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(KilometroHectometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(KilometroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Metros")) {
            String res = String.valueOf(KilometroMetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(KilometroDecimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(KilometroCentimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Kilometros") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(KilometroMilimetro(valorIngresado));
            tv1.setText(res);
            //HECTOMETROS
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Hectometros")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(HectometroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(HectometroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Metros")) {
            String res = String.valueOf(HectometroMetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(HectometroDecimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(HectometroCentimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Hectometros") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(HectometroMilimetro(valorIngresado));
            tv1.setText(res);
        }
        //DECAMETROS
        else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Decametro")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(DecametroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(DecametroHectometros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Metros")) {
            String res = String.valueOf(DecametroMetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(DecametroMetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(DecametroCentimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decametro") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(DecametroMilimetro(valorIngresado));
            tv1.setText(res);
        }
        //METROS
        else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Metros")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(MetroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(MetroHectometros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(MetroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(MetroDecimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(MetroCentimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Metros") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(MetroMilimetro(valorIngresado));
            tv1.setText(res);
        }
        //DECIMETRO
        else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Decimetro")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(DecimetroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(DecimetroHectometros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(DecimetroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Metro")) {
            String res = String.valueOf(DecametroMetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(DecimetroCentimetros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Decimetro") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(DecimetroMilimetro(valorIngresado));
            tv1.setText(res);
        }
        //CENTIMETRO
        else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Centimetro")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(CentimetroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(CentimetroHectometros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(CentimetroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Metro")) {
            String res = String.valueOf(CentimetroMetros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(CentimetroDecimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Centimetro") && opcionConversion.equals("Milimetro")) {
            String res = String.valueOf(CentimetroMilimetro(valorIngresado));
            tv1.setText(res);
        }
        //MILIMETRO
        else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Milimetro")) {
            tv1.setText(String.valueOf(valorIngresado));
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Kilometros")) {
            String res = String.valueOf(MilimetroKilometro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Hectometros")) {
            String res = String.valueOf(MilimetroHectometros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Decametro")) {
            String res = String.valueOf(MilimetroDecametro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Metro")) {
            String res = String.valueOf(MilimetroMetros(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Decimetro")) {
            String res = String.valueOf(MilimetroDecimetro(valorIngresado));
            tv1.setText(res);
        } else if (longitudSeleccionado.equals("Milimetro") && opcionConversion.equals("Centimetro")) {
            String res = String.valueOf(MilimetroCentimetro(valorIngresado));
            tv1.setText(res);
        }
    }

    //FORMULAS DE CADA EJERCICIO:
    //KILOMETRO------------------------------------------------
    public double KilometroHectometro(Double valorIngresado) {
        return valorIngresado * 10;
    }

    public double KilometroDecametro(Double valorIngresado) {
        return valorIngresado * 100;
    }

    public double KilometroMetro(Double valorIngresado) {
        return valorIngresado * 1000;
    }

    public double KilometroDecimetro(Double valorIngresado) {
        return valorIngresado * 10000;
    }

    public double KilometroCentimetro(Double valorIngresado) {
        return valorIngresado * 100000;
    }

    public double KilometroMilimetro(Double valorIngresado) {
        return valorIngresado * 1000 * 1000;
    }

    //HECTOMETRO----------------------------------------------
    public double HectometroKilometro(Double valorIngresado) {
        return valorIngresado / 10;
    }

    public double HectometroDecametro(Double valorIngresado) {
        return valorIngresado * 10;
    }

    public double HectometroMetro(Double valorIngresado) {
        return valorIngresado * 100;
    }

    public double HectometroDecimetro(Double valorIngresado) {
        return valorIngresado * 1000;
    }

    public double HectometroCentimetro(Double valorIngresado) {
        return valorIngresado * 10000;
    }

    public double HectometroMilimetro(Double valorIngresado) {
        return valorIngresado * 100000;
    }

    //DECAMETRO-----------------------------------------------
    public double DecametroKilometro(Double valorIngresado) {
        return valorIngresado / 100;
    }

    public double DecametroHectometros(Double valorIngresado) {
        return valorIngresado / 10;
    }

    public double DecametroMetro(Double valorIngresado) {
        return valorIngresado * 10;
    }

    public double DecametroDecimetro(Double valorIngresado) {
        return valorIngresado * 100;
    }

    public double DecametroCentimetro(Double valorIngresado) {
        return valorIngresado * 1000;
    }

    public double DecametroMilimetro(Double valorIngresado) {
        return valorIngresado * 10000;
    }

    //METRO-----------------------------------------------------
    public double MetroKilometro(Double valorIngresado) {
        return valorIngresado / 1000;
    }

    public double MetroHectometros(Double valorIngresado) {
        return valorIngresado / 100;
    }

    public double MetroDecametro(Double valorIngresado) {
        return valorIngresado / 10;
    }

    public double MetroDecimetro(Double valorIngresado) {
        return valorIngresado * 10;
    }

    public double MetroCentimetro(Double valorIngresado) {
        return valorIngresado * 100;
    }

    public double MetroMilimetro(Double valorIngresado) {
        return valorIngresado * 1000;
    }

    //DECIMETROS--------------------------------------------
    public double DecimetroKilometro(Double valorIngresado) {
        return valorIngresado / 10000;
    }

    public double DecimetroHectometros(Double valorIngresado) {
        return valorIngresado / 1000;
    }

    public double DecimetroDecametro(Double valorIngresado) {
        return valorIngresado / 100;
    }

    public double DecimetroMetros(Double valorIngresado) {
        return valorIngresado / 10;
    }

    public double DecimetroCentimetros(Double valorIngresado) {
        return valorIngresado * 10;
    }

    public double DecimetroMilimetro(Double valorIngresado) {
        return valorIngresado * 100;
    }

    //CENTIMETROS---------------------------------------------
    public double CentimetroKilometro(Double valorIngresado) {
        return valorIngresado / 100000;
    }

    public double CentimetroHectometros(Double valorIngresado) {
        return valorIngresado / 10000;
    }

    public double CentimetroDecametro(Double valorIngresado) {
        return valorIngresado / 1000;
    }

    public double CentimetroMetros(Double valorIngresado) {
        return valorIngresado / 100;
    }

    public double CentimetroDecimetro(Double valorIngresado) {
        return valorIngresado / 10;
    }

    public double CentimetroMilimetro(Double valorIngresado) {
        return valorIngresado * 10;
    }

    //MILIMETROS
    public double MilimetroKilometro(Double valorIngresado) {
        return valorIngresado*1000/1000;
    }

    public double MilimetroHectometros(Double valorIngresado) {
        return valorIngresado / 100000;
    }

    public double MilimetroDecametro(Double valorIngresado) {
        return valorIngresado / 10000;
    }

    public double MilimetroMetros(Double valorIngresado) {
        return valorIngresado / 1000;
    }

    public double MilimetroDecimetro(Double valorIngresado) {
        return valorIngresado / 100;
    }

    public double MilimetroCentimetro(Double valorIngresado) {
        return valorIngresado / 10;
    }
}