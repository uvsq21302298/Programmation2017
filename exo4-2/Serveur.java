import java.util.ArrayList;
import java.util.Iterator;

public class Serveur
{
    private ArrayList<Client> clients; //liste "clients" de client connectés
    
    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        clients = new ArrayList<Client>(); // On affecte a la liste clients une nouvelle liste client vide
    }

    public boolean connecter(Client client)
    {
        if(clients.contains(client)) {  //Le client est déja connecter (déja dans la 
            return false;
        }
        else {
            return clients.add(client); // Si il n'est pas déja présent, on l'ajoute
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> liste_clients = clients.iterator(); // On affecte la liste clients a une liste itérative qu'on peut parcourir.
        
        while(liste_clients.hasNext()) { //tant que la liste a un suivant
            liste_clients.next().recevoir(message);   
        }
    }
}
