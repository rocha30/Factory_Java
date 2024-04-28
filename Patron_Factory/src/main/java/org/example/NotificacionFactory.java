package org.example;

public class NotificacionFactory {
    public Notificacion crearMensaje(String type){
        if (type.equals("Email")){
            return new EmailNotificacion();
        } else if (type.equals("SMS")) {
            return new SMSNotificacion();
        } else if (type.equals("App")) {
            return new AppNotificacion();
        }
        throw new IllegalArgumentException("No se sabe el tipo de mensaje");
    }


}
