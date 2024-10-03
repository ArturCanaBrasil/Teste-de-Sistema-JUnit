package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RegistroCaminhaoTeste {

    RegistroCaminhao rc = new RegistroCaminhao();

    @Test
    public void testRegistrarCaminhao() {
        String placa = "abc1234";
        String nome = "João Silva";
        String estacionamento = "doca";
       
        String resultado = rc.registrarVeiculo(placa, nome, estacionamento);
                
        String esperado = "Veículo registrado:\nPlaca: abc1234\nNome do Proprietário: João Silva\nEstacionamento: doca5";
        assertEquals(esperado, resultado);
    }
    
}
