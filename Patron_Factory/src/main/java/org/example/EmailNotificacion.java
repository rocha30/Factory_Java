package org.example;

public class EmailNotificacion implements Notificacion {
    public void enviarMensaje(String Mensaje){
        System.out.println("El mensaje fue enviado via Email");
    }
}
