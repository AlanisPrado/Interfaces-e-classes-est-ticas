/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamentos;

/**
 *
 * @author alenis
 */
// Interface Pagador
public interface Pagador {
    void processarPagamento(double valor);
}

// Classe CartaoCredito
 class cartaoCredito implements Pagador {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com Cartao de Credito no valor de R$" + valor);
    }
}

// Classe BoletoBancario
 class boletoBancario implements Pagador {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com Boleto Bancario no valor de R$" + valor);
    }
}
