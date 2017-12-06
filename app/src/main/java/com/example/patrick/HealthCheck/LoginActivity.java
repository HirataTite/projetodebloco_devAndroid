package com.example.patrick.HealthCheck;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Patrick on 27/11/2017.
 */

public class LoginActivity extends AppCompatActivity{

    private EditText nome;
    private EditText password;
    private TextView info;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        nome = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        info = (TextView) findViewById(R.id.tvInfo);
        button = (Button) findViewById(R.id.btnLogin);

        info.setText("Tentativas restantes: 5");

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                validate(nome.getText().toString(),password.getText().toString());

            }
        });
    }

    private void validate(String user, String password){

        if ((user.equals("alunos.infnet@gmail.com")) && (password.equals("alunosinfnet1234"))){
            Intent intent = new Intent(LoginActivity.this, CalculoActivity.class);
            startActivity(intent);
        } else {
            int count = 5;
            count--;
            info.setText("Tentativas restantes: "+ String.valueOf(count));
            if (count == 0){
                button.setEnabled(false);
            }
        }
    }
}


