/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgConta;

/**
 *
 * @author 313122409
 */
public interface intContaBancaria {
    public void setAgencia(int numero);
    public void saque(double valor);
    public void deposito(double valor);
    public void nomeCliente(String nome);
    public String getNome();
    public double getSaldo();
    public int getAgencia();
    public void setCPF(int cpf);
    public int getCPF();
}