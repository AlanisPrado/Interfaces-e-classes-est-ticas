/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pagamentos;

/**
 *
 * @author alenis
 */
public class Pagando{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pagador cartao = new cartaoCredito();
        Pagador boleto = new boletoBancario();

        cartao.processarPagamento(250.00);
        boleto.processarPagamento(150.00);
    }

}
