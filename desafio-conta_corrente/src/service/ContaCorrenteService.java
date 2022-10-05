package service;

import domain.model.ContaCorrente;
import lombok.RequiredArgsConstructor;

import java.text.ParseException;

@RequiredArgsConstructor
public class ContaCorrenteService {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.depositar(4.4);
        System.out.println(cc.sacar(1));
        System.out.println(cc.extrato());
        System.out.println(cc.saldo());
    }

}
