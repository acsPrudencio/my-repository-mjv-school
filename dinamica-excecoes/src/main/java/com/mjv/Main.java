package com.mjv;

import com.mjv.validations.ValorNegativo;

public class Main {
    public static void main(String[] args) throws ValorNegativo {
        System.out.println(getResultado(-7, 11));
    }
    private static double getResultado(double numero1, double numero2) throws ValorNegativo {
        if(numero1 < 0){
            throw new ValorNegativo(numero1);
        }else if(numero2 > 10){
            throw new ArithmeticException("Valor nao pode ser maior que dez");
        }else {
            return numero1 > numero2 ? numero1 - numero2 : numero2 - numero1;
        }
    }

}