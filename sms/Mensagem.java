/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sms;

/**
 *
 * @author alenis
 */
public class Mensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        emailNotificador email = new emailNotificador();
        smsNotificador sms = new smsNotificador();
        
        email.enviarNotificacao("Ola, segue anexo...");
        sms.enviarNotificacao("Segue o SMS...");
        
        
    }
    
}
