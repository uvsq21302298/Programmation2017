
/**
 * Write a description of class Fichier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fichier extends Composant
{
    // instance variables - replace the example below with your own
    private int taille;

    /**
     * Constructor for objects of class Fichier
     */
    public Fichier(String nom, int taille)
    {
        // initialise instance variables
        this.nom = nom;
        this.taille = taille;
    }

    public int calculTaille()
    {
        return taille;
    }
}