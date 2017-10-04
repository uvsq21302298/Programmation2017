

/** 
 * @Thibault Chouipe 
 * @02/10/2017
 */
public class Main
{
    /**
     * Constructor for objects of class Main
     */
    public static void main(String args[])
    {
        Fichier fic = new Fichier("doc",3);    
        System.out.println(fic.calculTaille());
        Fichier fic2 = new Fichier("doc",3);
        Repertoire rep = new Repertoire("repository");
        rep.ajouter(fic);
        rep.ajouter(fic2);
        System.out.println(rep.calculTaille());
    }
}
