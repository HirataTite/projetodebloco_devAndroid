package com.example.patrick.HealthCheck;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Patrick on 28/11/2017.
 */

public class MuralActivity extends AppCompatActivity {

    private TextView tvResultado;
    private TextView tvPercentual;
    private String nome;
    private String percent;
    private String resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mural_activity);

        tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvPercentual = (TextView) findViewById(R.id.tvPercentual);


        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            nome = getIntent().getStringExtra("NOME");
            resultado = getIntent().getStringExtra("IMC");
            percent = getIntent().getStringExtra("PERCENTUAL");
            tvPercentual.setText("Percentual de Gordura: " + percent+"%");

            float imc = Float.parseFloat(resultado);
            if (imc < 17) {
                tvResultado.setText(nome + " muito abaixo do peso com IMC: "+resultado);
            } else if (imc >= 17 && imc < 18.49) {
                tvResultado.setText(nome + " abaixo do peso com IMC: "+resultado);
            } else if (imc >= 18.5 && imc < 24.99) {
                tvResultado.setText(nome + " peso normal com IMC: "+resultado);
            } else if (imc >= 25 && imc < 29.99) {
                tvResultado.setText(nome + " acima do peso com IMC: "+resultado);
            } else if (imc >= 30 && imc < 34.99) {
                tvResultado.setText(nome + " Obesidade I com IMC: "+resultado);
            } else if (imc > 35 && imc < 39.99) {
                tvResultado.setText(nome + " Obesidade II(severa) com IMC: "+resultado);
            } else if (imc > 40) {
                tvResultado.setText(nome + " Obesidade III(mórbida) com IMC: "+resultado);
            }
        }
    }
}
