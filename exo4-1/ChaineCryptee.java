
/**
 * Thibault CHOUIPE 21302298
 */
public class ChaineCryptee
{
    private String encrypte;
    private int decalage;
    /**
     * Constructor for objects of class ChaineCryptee
     */
    //en private car pas de besoin utilisateur
    private ChaineCryptee(String enclair, int decalage)
    {
        int i;
        StringBuilder str = new StringBuilder();
        
        if(enclair != null) {
            for(i = 0; i < enclair.length(); i++) {
                str.append(decalagechar(enclair.toUpperCase().charAt(i), decalage));
            }
        }
        this.encrypte = str.toString();
        this.decalage = decalage;
    }
    //en private car pas de besoin utilisateur
    private static char decalagechar(char c, int decalage){  
            return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage) % 26) + 'A');
    }
    
    public static ChaineCryptee FromCrypted(String encrypte, int decalage) { 
        int i;
        StringBuilder str = new StringBuilder();
        if(encrypte != null) {
            for(i = 0; i < encrypte.length(); i++) {
                str.append(decalagechar(encrypte.toUpperCase().charAt(i), - decalage));
            }
        }
        ChaineCryptee chainec = new ChaineCryptee(str.toString(), decalage);
        return chainec;
    }
    
    public static ChaineCryptee FromDecrypted(String enclair, int decalage) {
        ChaineCryptee chainec = new ChaineCryptee(enclair, decalage);
        return chainec;
    }
    
    public String Decrypte()
    {
        int i;
        StringBuilder str = new StringBuilder();
        
        for(i = 0; i < encrypte.length(); i++) {
            str.append(decalagechar(encrypte.toUpperCase().charAt(i), - decalage));
        }
        return str.toString();
    }
    
    public String Crypte()
    {
        return encrypte;
    }
}
