
/**
 * Write a description of class ChaineCryptee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChaineCryptee
{
    // instance variables - replace the example below with your own
    private String enclair;
    private int decalage;

    /**
     * Constructor for objects of class ChaineCryptee
     */
    public ChaineCryptee(String enclair, int decalage)
    {
        // initialise instance variables
        this.enclair = toUpperCase().enclair;
        this.decalage = decalage;
    }
    public char decalagechar(char c, int decalage){  
            return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage) % 26) + 'A');
    }
    
    
    public String Decrypte()
    {
        // put your code here
        return enclair;
    }
    
    
    public String Crypte()
    {
        int i; char c;
        String crypte = "";
        String encrypte = enclair;
        for(i=0;i<encrypte.length(); i++){
            c = decalagechar(enclair.charAt(i),decalage);
            crypte = crypte + c;
        }
        return encrypte;
    }
}
