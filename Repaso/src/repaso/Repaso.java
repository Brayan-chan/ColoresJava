
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
        String textoEnNegrita = "Java Junior Level. UACAM";
        
        System.out.println(textoEnNegrita);
        System.out.println("\033[0;1m" + textoEnNegrita);
        
        System.out.println(ANSI_PURPLE + textoEnNegrita);
    }
    
}
