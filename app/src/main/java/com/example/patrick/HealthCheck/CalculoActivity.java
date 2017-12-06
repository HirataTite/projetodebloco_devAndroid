package com.example.patrick.HealthCheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CalculoActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private EditText editNome;
    private EditText editIdade;
    private RadioButton editSexoF;
    private RadioButton editSexoM;
    final float[] imc = new float[1];
    private float percentGordura;
    private int coeficiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculo_activity);

        Button btCalcular = (Button) findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editPeso = (EditText) findViewById(R.id.editPeso);
                editAltura = (EditText) findViewById(R.id.editAltura);
                editNome = (EditText) findViewById(R.id.editNome);
                editIdade = (EditText) findViewById(R.id.editIdade);
                editSexoF = (RadioButton) findViewById(R.id.editSexoF);
                editSexoM = (RadioButton) findViewById(R.id.editSexoM);

                float peso = Float.parseFloat(editPeso.getText().toString());
                float altura = Float.parseFloat(editAltura.getText().toString());
                int idade = Integer.parseInt(editIdade.getText().toString());
                imc[0] = peso / (altura * altura);
                String nome = editNome.getText().toString();
                Intent intent = new Intent(CalculoActivity.this, MuralActivity.class);

                if (imc[0] < 18.5){
                    if (editSexoF.isChecked()){
                        coeficiente = 0;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    } else if(editSexoM.isChecked()) {
                        coeficiente = 1;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    }
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);

                } else if(imc[0] < 25.0) {
                    if (editSexoF.isChecked()){
                        coeficiente = 0;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    } else if(editSexoM.isChecked()) {
                        coeficiente = 1;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    }
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);

                } else if(imc[0] < 30.0) {
                    if (editSexoF.isChecked()){
                        coeficiente = 0;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    } else if(editSexoM.isChecked()) {
                        coeficiente = 1;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    }
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);

                } else  {
                    if (editSexoF.isChecked()){
                        coeficiente = 0;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    } else if(editSexoM.isChecked()) {
                        coeficiente = 1;
                        percentGordura = (float) ((1.2 * imc[0]) + (0.23 * idade) - (10.8 * coeficiente) - 5.4);
                        intent.putExtra("PERCENTUAL", percentGordura + "");
                    }
                    intent.putExtra("IMC", imc[0] + "");
                    intent.putExtra("NOME", nome);
                    startActivity(intent);

                }
            }
        });
    }

}
