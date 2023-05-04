/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mail;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */
public class claseMail {
     public static ArrayList<Mail> mails = new ArrayList<>();
    
    private int id;
    private String emailUser;
    private String emailSend;
    private String asunto;
    private String cuerpo;
    private String fecha;
    private String status;

    public claseMail() {
    }

    public claseMail(int id, String emailUser, String emailSend, String asunto, String cuerpo, String fecha, String status) {
        this.id = id;
        this.emailUser = emailUser;
        this.emailSend = emailSend;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.fecha = fecha;
        this.status = status;
    }

    public static ArrayList<Mail> getMails() {
        return mails;
    }

    public static void setMails(ArrayList<Mail> mails) {
        claseMail.mails = mails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getEmailSend() {
        return emailSend;
    }

    public void setEmailSend(String emailSend) {
        this.emailSend = emailSend;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "claseMail{" + "id=" + id + ", emailUser=" + emailUser + ", emailSend=" + emailSend + ", asunto=" + asunto + ", cuerpo=" + cuerpo + ", fecha=" + fecha + ", status=" + status + '}';
    }
    
    
    
    
}
