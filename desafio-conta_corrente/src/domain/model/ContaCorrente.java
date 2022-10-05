package domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrente extends Conta{
    protected double taxaSaque = 1;
    protected double taxaTransferencia = 0.5;

    @Override
    public String sacar(double valor){
        if((saldo-(taxaSaque+valor))>=0) {
            saldo = saldo - (valor + taxaSaque);
            extrato += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")) + "\n" + "Saque: R$ " + nf.format(valor) + "\nTaxa Saque: R$ " + nf.format(taxaSaque) + "\n";
            return "Saque realizado com sucesso";
        }
        return "Saldo insuficiente para esta transação";
    }


}
