package com.mjv;

import com.mjv.validations.LimiteExcedido;
import com.mjv.validations.ValorNegativo;

public class ExercicioExcecoes {
    public double diferenca(double numero1, double numero2) throws ValorNegativo, LimiteExcedido {
        if(numero1 < 0){
            throw new ValorNegativo(numero1);
        }else if(numero2 > 10){
            throw new LimiteExcedido(numero2);
        }else {
            return numero1 > numero2 ? numero1 - numero2 : numero2 - numero1;
        }
    }

}