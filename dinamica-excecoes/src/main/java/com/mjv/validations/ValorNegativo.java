package com.mjv.validations;

public class ValorNegativo extends Exception{
    public ValorNegativo(double numero){
        super("\nValor recebido " + numero + "\n O valor deve ser maior que zero");
    }
}
