package org.example;

public class UrgenteNotificacionFactory implements NotiFactory{
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}

