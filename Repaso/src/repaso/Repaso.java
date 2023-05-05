package repaso;
//import java.util.Scanner;
import models.Mail;
import static models.Mail.mails;
/**
 *
 * @author chanp
 */
public class Repaso {
    //static Scanner input = new Scanner(System.in);
    /*
    public static void enviarCorreo(){
        System.out.println("De:");
        String emailUser;
        emailUser = input.next();
        System.out.println("Para:");
        String emailSend;
        emailSend = input.next();
    
    }
    */
    
        public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
  /*
            String textoEnNegrita = "Java Junior Level. UACAM";
            System.out.println(textoEnNegrita);
            System.out.println("\033[0;1m" + textoEnNegrita);
            System.out.println(ANSI_PURPLE + textoEnNegrita);
             */ /*
            String userSend = "al071392@uacam.mx";
            String fechaEnvio = "04-05-2023";
            String userRecip = "brayanc@uacam.mx";
            String asunto = "Prueba de correo electronico";
            String cuerpo = "Por medio del presente solicito la sala 3";
            String status = "Enviedo";
            System.out.println("De: " + userSend);
            System.out.println("Para: " + userRecip);
            System.out.println("\033[0;1m"+ "Fecha: " + fechaEnvio);
            System.out.println(ANSI_BLUE + "Asunto: " + asunto);
            System.out.println(ANSI_GREEN + "Cuerpo: " + cuerpo);
            System.out.println(ANSI_RED + "Estatus: " + status);
             */ //enviarCorreo();
            
        mails.add(new Mail(1, "al071392@uacam,mx", "04-05-2023", "edcaamal@uacam,mx", "Prueba de correo electronico", "Por medio del presente solicito la sala 3", "Enviado"));
        /*
        String emailUser = "al071392@uacam,mx";
        String fecha = "04-05-2023";
        String emailSend = "edcaamal@uacam,mx";
        String asunto = "Prueba de correo electronico";
        String cuerpo = "Por medio del presente solicito la sala 3";
        String status = "Enviado";
       */
        mails.add(new Mail(2, "al071392@uacam,mx", "04-05-2023", "tomas@uacam,mx", "Prueba de sistema", "Por medio del presente solicito una validacion", "Enviado"));
        mails.add(new Mail(3, "al071392@uacam,mx", "04-05-2023", "paola@uacam,mx", "Prueba de correo electronico", "Solicito una validacion de codigo", "Enviado"));

        /*
        System.out.println("De:"+emailUser);
        System.out.println("Para:"+emailSend);
        System.out.println("\033[0;1m" + "Fecha: " + fecha);
        System.out.println(ANSI_BLUE + "Asunto: " + asunto);
        System.out.println(ANSI_GREEN+ "Cuerpo: " + cuerpo);
        System.out.println(ANSI_RED + "Estatus: " + status);
        */
        
        System.out.println(mails);
    
    }
    
}
