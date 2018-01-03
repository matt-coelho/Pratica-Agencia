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
public class ContaBancaria implements intContaBancaria {

    String nomeCliente;
    int agencia;
    double saldo = 0;
    int cpfCliente;
    
    @Override
    public void setAgencia(int numero){
        sAgencia(numero);
    }
    //
    private void sAgencia(int numero){
        agencia = numero;
    }
    // //
    @Override
    public void saque(double valor) {
        oSaque(valor);
    }
    //
    private void oSaque(double valor) {
        saldo -= valor;
    }
    // //
    @Override
    public void deposito(double valor) {
        oDeposito(valor);
    }
    //
    private void oDeposito(double valor) {
        saldo += valor;
    }
    // //
    @Override
    public void nomeCliente(String nome) {
        oNome(nome);
    }
    //
    private void oNome(String nome) {
        nomeCliente = nome;
    }
    // //
    @Override
    public String getNome() {
        return gNome();
    }
    //
    private String gNome() {
        return nomeCliente;
    }
    // //
    @Override
    public double getSaldo(){
        return gSaldo();
    }
    //
    private double gSaldo(){
        return saldo;
    }
    // //
    @Override
    public int getAgencia(){
        return gAgencia();
    }
    //
    private int gAgencia(){
        return agencia;
    }
    // //
    @Override
    public void setCPF(int cpf){
        sCPF(cpf);
    }
    //
    private void sCPF(int cpf){
        cpfCliente = cpf;
    }
    // //
    @Override
    public int getCPF(){
        return gCPF();
    }
    //
    private int gCPF(){
        return cpfCliente;
    }
}
