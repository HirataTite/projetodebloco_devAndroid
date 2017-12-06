package com.example.patrick.HealthCheck;

import junit.framework.TestCase;

/**
 * Created by Patrick on 04/12/2017.
 */

public class PessoaTest extends TestCase{

    public void testCalculoImcParaPessoaComPesoAdequado(){
        Pessoa p = new Pessoa("Fulano", 30, 1.90, 80);
        boolean resultado = p.calculaImc();
        assertTrue(resultado);

    }
}
