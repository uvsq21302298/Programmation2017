
/**
 * Abstract class Composant - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Composant
{
    // instance variables - replace the example below with your own
    private String nom;
    
    abstract int calculTaille();
    public String getNom() { return nom;}
    public void setNom(String nom) { this.nom = nom; }
    
}