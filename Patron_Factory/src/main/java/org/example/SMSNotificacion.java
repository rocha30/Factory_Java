package org.example;

public class SMSNotificacion implements Notificacion {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("El mensaje fue enviado via SMS");
    }



}
