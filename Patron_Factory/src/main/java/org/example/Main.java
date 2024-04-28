package org.example;

public class Main {
    public static void main(String[] args) {
        NotificacionFactory factory = new NotificacionFactory();
        Notificacion notificacion = factory.crearMensaje("SMS");
        Notificacion notificacion1 = factory.crearMensaje("Email");
        Notificacion notificacion2 = factory.crearMensaje("App");

        notificacion1.enviarMensaje("Su mensaje a sido enviado por Email");
        notificacion.enviarMensaje("Su mensaje a sido enviado por SMS");
        notificacion2.enviarMensaje("Su menasje a sido envidado por la App");


    }
}