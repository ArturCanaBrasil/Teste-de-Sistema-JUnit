package com.example.demo;

public class RegistroCaminhao {
    
    public String registrarVeiculo(String placa, String nome, String estacionamento) {
        // Cria a mensagem de registro
        String registro = "Veículo registrado:\n" +
                          "Placa: " + placa + "\n" +
                          "Nome do Proprietário: " + nome + "\n" +
                          "Estacionamento: " + estacionamento;

        // Adiciona uma mensagem se o estacionamento não for "doca5"
        if (!estacionamento.equals("doca5")) {
            registro += "\nAtenção: O estacionamento informado não é válido.";
        }

        // Imprime a mensagem (opcional)
        System.out.println(registro);
        
        // Retorna a mensagem
        return registro;
    }
}
