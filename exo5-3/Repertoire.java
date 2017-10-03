import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Repertoire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Repertoire extends Composant
{
    // instance variables - replace the example below with your own
    private ArrayList<Composant> composants;

    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        this.setNom(nom);
        this.composants = new ArrayList<Composant>();
    }
    
    public boolean contient(Composant comp) {
        Iterator<Composant> liste_comp = composants.iterator();
        Composant tmp;
        
        while(liste_comp.hasNext()) {
            tmp = liste_comp.next();
            
            if(tmp.equals(comp)){
                return true;
            }
            else if(tmp instanceof Repertoire) {
                //On teste récursivement si comp est dans un sous-repertoire
                 if(((Repertoire) tmp).contient(comp)) {
                    return true;
                }
            }
        }
        //On a parcouru dans tout le répertoire
        return false;
    }
    
    public boolean ajouter(Composant comp)
    {
        if(this.contient(comp)) {
            return false;
        }
        else if((comp instanceof Repertoire) && (((Repertoire) comp).contient(this))) {
            return false;
        }
        else {
            return composants.add(comp);
        }
    }
    
    public boolean retirer(Composant comp)
    {
        return composants.remove(comp);
    }
    
    public int calculTaille()
    {
        Iterator<Composant> liste_comp = composants.iterator();
        int somme = 0;
        
        while(liste_comp.hasNext()) {
            somme += liste_comp.next().calculTaille(); 
        }
        return somme;
    }
}