/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author alenis
 */
public interface Veiculo {

    public void ligar();

    public void desligar();

}

class Carro implements Veiculo {

    @Override
    public void ligar() {
        System.out.println("O carro esta ligado.");
    }
    @Override
     public void desligar() {
        System.out.println("O carro esta desligado.");
    }
}

class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("O Moto esta ligado.");
    }
    @Override
     public void desligar() {
        System.out.println("O Moto esta desligado.");
    } 
}
class Bicicleta implements Veiculo{
     @Override
    public void ligar() {
        System.out.println("O Bicicleta esta ligado.");
    }
    @Override
     public void desligar() {
        System.out.println("O Bicicleta esta desligado.");
    }
}
