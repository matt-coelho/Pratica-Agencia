/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgAgencia;
import java.util.LinkedList;
import pkgConta.ContaBancaria;

/**
 *
 * @author 313122409
 */
public class Agencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        LinkedList usuarios = new LinkedList();
        c.setAgencia(10010110);
        c.nomeCliente("Matheus");
        c.setCPF(1256432);
        c.deposito(59877);
        System.out.println("saque: 220");
        c.saque(220);
        System.out.println("agencia "+c.getAgencia() +"| Cliente "+c.getNome()+"\nSaldo: "+c.getSaldo()+"\ncpf: "+c.getCPF());
    }
}
