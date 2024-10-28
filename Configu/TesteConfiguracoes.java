/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Configu;

/**
 *
 * @author alenis
 */
public class TesteConfiguracoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Configuracoes.definirAmbiente("Produção");
        System.out.println("Ambiente atual: " + Configuracoes.obterAmbiente());

        Configuracoes.definirAmbiente("Desenvolvimento");
        System.out.println("Ambiente atual: " + Configuracoes.obterAmbiente());
    }
    
}
