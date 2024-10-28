/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Configu;

/**
 *
 * @author alenis
 */
public class Configuracoes {
    // Classe Configuracoes

    private static String ambiente;

    public static void definirAmbiente(String novoAmbiente) {
        ambiente = novoAmbiente;
    }

    public static String obterAmbiente() {
        return ambiente;
    }
}


