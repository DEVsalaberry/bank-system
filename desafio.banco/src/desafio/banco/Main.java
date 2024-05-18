package desafio.banco;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cliente felipe = new Cliente();
        felipe.setNome("felipe");

        Conta cc = new ContaCorrente(felipe, 150.0);
        Conta poupanca = new ContaPoupanca(felipe, 200.0);

        Banco banco = new Banco();
        banco.setNome("Meu Banco");
        banco.setContas(new ArrayList<>());
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        banco.imprimirSaldos();
    }
}
