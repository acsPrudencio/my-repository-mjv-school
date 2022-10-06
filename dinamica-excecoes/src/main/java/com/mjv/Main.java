package com.mjv;

import com.mjv.validations.LimiteExcedido;
import com.mjv.validations.ValorNegativo;

public class Main {
    public static void main(String[] args) throws ValorNegativo, LimiteExcedido {
        System.out.println(getResultado(1, 7));
    }
    private static double getResultado(double numero1, double numero2) throws ValorNegativo, LimiteExcedido {
        if(numero1 < 0){
            throw new ValorNegativo(numero1);
        }else if(numero2 > 10){
            throw new LimiteExcedido(numero2);
        }else {
            return numero1 > numero2 ? numero1 - numero2 : numero2 - numero1;
        }
    }

}