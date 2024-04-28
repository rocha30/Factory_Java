package org.example;

import javax.swing.plaf.PanelUI;

public class AppNotificacion implements Notificacion{

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("La aplicación ha enviado el mensaje");
    }
}
