package com.mjv.validations;

public class LimiteExcedido extends Exception{
    public LimiteExcedido(double numero){
        super("Valor passado como parametro: " + numero + "mas, o valor limite eh: 10");
    }
}
