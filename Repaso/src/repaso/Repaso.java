
package repaso;

/**
 *
 * @author chanp
 */
public class Repaso {
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
*/
        
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
        
   
    
    }
    
}
