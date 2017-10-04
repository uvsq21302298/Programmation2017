import java.util.ArrayList;
import java.util.Iterator;

public class Serveur
{
    private ArrayList<Client> clients; //liste de client connecté
    
    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        clients = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if(clients.contains(client)) {  //Le client est déja connecter
            return false;
        }
        else {
            return clients.add(client); // Si il n'est pas déja présent, on l'ajoute
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> liste_clients = clients.iterator(); //création d'une liste qu'on peut parcourir avec iterator
        
        while(liste_clients.hasNext()) {
            liste_clients.next().recevoir(message);   //Tant que j'ai des clients dans la liste, je leurs envoient le message
        }
    }
}
