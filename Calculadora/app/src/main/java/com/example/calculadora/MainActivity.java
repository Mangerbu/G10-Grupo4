package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtOperando1;
    private EditText txtOperando2;
    private Spinner cboOperador;
    private Button btnOperar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOperando1=(EditText) findViewById(R.id.txtOperando1);
        txtOperando2=(EditText) findViewById(R.id.txtOperando2);
        cboOperador=(Spinner) findViewById(R.id.cboOperador);
        btnOperar=(Button) findViewById(R.id.btnOperar);
        lblResultado=(TextView) findViewById(R.id.lblResultado);
        btnOperar.setOnClickListener(this);
        cargarSpinner();
    }

    private void cargarSpinner() {
        String [] operadores={"Hombre", "Mujer"};
        cboOperador.setAdapter(new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,operadores));
    }

    @Override
    public void onClick(View view) {
        Double operando1=Double.parseDouble(txtOperando1.getText().toString());
        Double operando2=Double.parseDouble(txtOperando2.getText().toString());
        Double resultado=0.0;
        String resultado2="";

        switch (cboOperador.getSelectedItem().toString()){
            //resultado=0.0;
            case "Mujer": resultado=operando2/(operando1*operando1)*10000;
                if (resultado<20) resultado2="Bajo peso";
                else if (resultado>=20 && resultado<=25) resultado2="Peso normal";
                else if (resultado>25 && resultado<=30) resultado2="Sobre peso";
                else if (resultado>30) resultado2="Obesidad";
                break;

            case "Hombre": resultado=operando2/(operando1*operando1)*10000;
                if (resultado<20) resultado2="Bajo peso";
                else if (resultado>=20 && resultado<=27) resultado2="Peso normal";
                else if (resultado>27 && resultado<=30) resultado2="Sobre peso";
                else if (resultado>30 && resultado<=40) resultado2="Obesidad";
                else if (resultado>40) resultado2="Obesidad Morbida";
                break;


        }
        lblResultado.setText("IMC= "+resultado.toString()+", "+resultado2);
    }
}