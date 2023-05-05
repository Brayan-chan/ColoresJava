package models;

import java.util.ArrayList;

/**
 *
 * @author chanp
 */

public class Mail {
    public static ArrayList<Mail> mails = new ArrayList<>();
    
    private int id;
    private String emailUser;
    private String fecha;
    private String emailSend;
    private String asunto;
    private String cuerpo;
    private String status;
    

    public Mail() {
    }

    public Mail(int id, String emailUser,  String fecha, String emailSend, String asunto, String cuerpo, String status) {
        this.id = id;
        this.emailUser = emailUser;
        this.fecha = fecha;
        this.emailSend = emailSend;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.status = status;
        
        
    }

    public static ArrayList<Mail> getMails() {
        return mails;
    }

    public static void setMails(ArrayList<Mail> mails) {
        Mail.mails = mails;
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
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    
      public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Mail{" + "id=" + id + ", emailUser=" + emailUser + ", fecha=" + fecha + ", emailSend=" + emailSend + ", asunto=" + asunto + ", cuerpo=" + cuerpo + ", status=" + status + '}';
    }
    

                       
}
