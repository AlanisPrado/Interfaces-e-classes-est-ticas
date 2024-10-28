/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bibioteca;

/**
 *
 * @author alenis
 */
public class Biblo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Livro livro = new Livro();
       Revista revi = new Revista();
       
       
       livro.emprestar();
       livro.devolver();
       
       revi.emprestar();
       revi.devolver();
    }
    
}
