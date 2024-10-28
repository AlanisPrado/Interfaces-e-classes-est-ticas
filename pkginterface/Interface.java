/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author alenis
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Carro car = new Carro();
        Moto mo = new Moto();
        Bicicleta bi = new Bicicleta();

        car.ligar();
        car.desligar();
        mo.ligar();
        mo.desligar();
        bi.ligar();
        bi.desligar();

    }

}
