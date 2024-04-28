package org.example;

public interface NotiFactory {
    EmailNotificacion crearEmailNotificacion();
    SMSNotificacion crearSMSNotificacion();
    AppNotificacion crearAppNotificacion();
}
