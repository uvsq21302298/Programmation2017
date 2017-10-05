import java.util.ArrayList;
import java.util.Iterator;


public class Repertoire extends Composant //repertoire hérite de composants
{
    private ArrayList<Composant> composants; //liste de composants

    /**
     * Constructor for objects of class Repertoire
     */
    public Repertoire(String nom)
    {
        this.nom = nom;
        this.composants = new ArrayList<Composant>();
    }
    
    public boolean contient(Composant comp) {
        Iterator<Composant> liste_composant = composants.iterator(); // on affecte la liste composants a une nouvelle liste qu'on peut parcourir
        Composant tmp;
        
        while(liste_composant.hasNext()) {
            tmp = liste_composant.next();
            if(tmp.equals(comp)){
                return true;
            }
            else if(tmp instanceof Repertoire) {
                 if(((Repertoire)tmp).contient(comp)) { //On teste de facon récursive si comp est dans un sous-repertoire
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ajouter(Composant comp)
    {
        if(this.contient(comp)) {
            return false;
        }
        else if((comp instanceof Repertoire) && (((Repertoire) comp).contient(this))) { //cast nécessaire pour le compilateur (car le type n'et connu que pdt execution)
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
        Iterator<Composant> liste_composant = composants.iterator();
        int somme = 0;
        
        while(liste_composant.hasNext()) {
            somme = somme + liste_composant.next().calculTaille(); 
        }
        return somme;
    }
}