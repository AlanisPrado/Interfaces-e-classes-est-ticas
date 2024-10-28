/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

/**
 *
 * @author alenis
 */
public interface Notificador {
    
   void enviarNotificacao(String mensagem);
    
}
class emailNotificador implements Notificador {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}

// Classe SMSNotificador implementando Notificador
class smsNotificador implements Notificador {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
