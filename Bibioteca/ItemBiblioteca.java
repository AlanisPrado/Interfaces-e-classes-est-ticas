/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bibioteca;

/**
 *
 * @author alenis
 */
public interface ItemBiblioteca {

    public void emprestar();

    public void devolver();

}
class Livro implements ItemBiblioteca{
    public void emprestar(){
        System.out.println("Emprestando o livro..");
    }
    @Override
    public void devolver(){
        System.out.println("Devolvento o livro");
    }
    
}
class Revista implements ItemBiblioteca{
    public void emprestar(){
        System.out.println("Emprestando o Revista..");
    }
    @Override
    public void devolver(){
        System.out.println("Devolvento o Revista");
    }
    
}
