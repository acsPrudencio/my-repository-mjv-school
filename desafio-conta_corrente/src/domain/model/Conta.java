package domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.LocalTime.now;

@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    protected String extrato = "";
    protected String numAgencia;
    protected String numConta;
    protected double saldo;
    protected double valor;
    protected Boolean status;
    protected NumberFormat nf = NumberFormat.getInstance();

    public boolean depositar(double valor){
        saldo += valor;
        extrato += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")) + "\n" +"Deposito R$ " + nf.format(valor) + "\n";
        return true;
    }
    public String sacar(double valor){
        if((saldo-valor)>=0){
            saldo -= valor;
            extrato += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:MM:ss")) + "\n" +"Saque: R$ " + nf.format(valor);
            return "Saque realizado com sucesso";
        }
    return "Saldo insuficiente para esta transação";
    }

    public String extrato(){
        return extrato;
    }

    public double saldo(){
        return saldo;
    }

}
