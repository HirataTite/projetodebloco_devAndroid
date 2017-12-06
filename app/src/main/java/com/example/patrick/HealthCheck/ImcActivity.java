package com.example.patrick.HealthCheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImcActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private EditText editNome;
    final float[] imc = new float[1];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc_activity);

        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editPeso = (EditText) findViewById(R.id.editPeso);
                editAltura = (EditText) findViewById(R.id.editAltura);
                editNome = (EditText) findViewById(R.id.editNome);

                float peso = Float.parseFloat(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                imc[0] = peso / (altura * altura);
                String nome = editNome.getText().toString();
                //Intent intent_name = new Intent(ImcActivity.this, MuralActivity.class);
                //intent_name.putExtra("NOME", nome);

                if (imc[0] < 18.5){
                    Intent intent = new Intent(ImcActivity.this, MuralActivity.class);
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);
                    //tvResultado.setText(imc[0] + "");
                    //tvDescricao.setText("Abaixo do Peso");

                } else if(imc[0] < 25.0) {
                    Intent intent = new Intent(ImcActivity.this, MuralActivity.class);
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);
                    //tvResultado.setText(imc[0] + "");
                    //tvDescricao.setText("Peso adequado");
                } else if(imc[0] < 30.0) {
                    Intent intent = new Intent(ImcActivity.this, MuralActivity.class);
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);
                    //tvResultado.setText(imc[0] + "");
                    //tvDescricao.setText("Sobrepeso");
                } else  {
                    Intent intent = new Intent(ImcActivity.this, MuralActivity.class);
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);
                    //tvResultado.setText(imc[0] + "");
                    //tvDescricao.setText("Obesidade");
                }
            }
        });
    }

}
