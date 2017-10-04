
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
        StringBuilder strmodif = new StringBuilder(); // String builder permet de créer une chaine de caractère qu'on peut modifier.(pour que sa soit immuable, convertir en string)
        
        if(enclair != null) {
            for(i = 0; i < enclair.length(); i++) {    //.length renvoie la taille de la chaine de caractère et permet de parcourir tout la chaine.
                strmodif.append(decalagechar(enclair.toUpperCase().charAt(i), decalage)); // str.append permet d'ajouter des caractères a un string builder.
            }
        }
        this.encrypte = strmodif.toString();  //On convertie la chaine modifiable en chaine non modifiable avant affectation
        this.decalage = decalage;
    }
   
   /**
   * Cette méthode décale de n caractère le char passer en arguments.
   * (exemple : si le char est A et le decalage 3 , alors la fonction renvoie D)
   */
    //en private car pas de besoin utilisateur
    private static char decalagechar(char c, int decalage){  
            return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage) % 26) + 'A');
    }
    
    /**
   * Cette méthode decrypte une chaine de caractère.
   */
    public static ChaineCryptee FromCrypted(String encrypte, int decalage) { 
        int i;
        StringBuilder strmodif = new StringBuilder();
        if(encrypte != null) {
            for(i = 0; i < encrypte.length(); i++) {
                strmodif.append(decalagechar(encrypte.toUpperCase().charAt(i), - decalage));
            }
        }
        ChaineCryptee chainec = new ChaineCryptee(strmodif.toString(), decalage);
        return chainec;
    }
    
    /**
   * Cette méthode crypte une chaine de caractère.
   */
    public static ChaineCryptee FromDecrypted(String enclair, int decalage) {
        ChaineCryptee chainec = new ChaineCryptee(enclair, decalage);
        return chainec;
    }
    
    /**
   * Cette méthode est un GETTER (permet d'obtenir une des valeurs de l'objet)
   */
    public String Decrypte()
    {
        int i;
        StringBuilder strmodif = new StringBuilder();
        
        for(i = 0; i < encrypte.length(); i++) {
            strmodif.append(decalagechar(encrypte.toUpperCase().charAt(i), - decalage));
        }
        return strmodif.toString();
    }
    
    /**
   * Cette méthode est un GETTER (permet d'obtenir une des valeurs de l'objet)
   */
    public String Crypte()
    {
        return encrypte;
    }
}
