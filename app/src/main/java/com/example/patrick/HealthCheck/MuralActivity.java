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
    private TextView tvDescricao;
    private String nome;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mural_activity);

        tvResultado = (TextView) findViewById(R.id.tvResultado);
        tvDescricao = (TextView) findViewById(R.id.tvDescricao);

        String resultado = getIntent().getStringExtra("IMC");
        tvResultado.setText(resultado);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            nome = getIntent().getStringExtra("NOME");

            float imc = Float.parseFloat(resultado);
            if (imc < 17) {
                tvDescricao.setText(nome + ", está muito abaixo do peso! Que tal comer mais um pouco, heim?");
            } else if (imc >= 17 && imc < 18.49) {
                tvDescricao.setText(nome + ", está abaixo do peso, ainda pode comer aquele podrão");
            } else if (imc >= 18.5 && imc < 24.99) {
                tvDescricao.setText(nome + ", está com peso normal");
            } else if (imc >= 25 && imc < 29.99) {
                tvDescricao.setText(nome + ", está acima do Peso! Começar a maneirar heim!");
            } else if (imc >= 30 && imc < 34.99) {
                tvDescricao.setText("Tome cuidado," + nome + ", você está com Obesidade I!");
            } else if (imc > 35 && imc < 39.99) {
                tvDescricao.setText("Tome cuidado," + nome + ", você está com Obesidade II (severa)!");
            } else if (imc > 40) {
                tvDescricao.setText("Tome cuidado," + nome + ", você está com Obesidade III (mórbida)!");
            }
        }
    }
}
