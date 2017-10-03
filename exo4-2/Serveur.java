import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Server here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serveur
{
    private ArrayList<Client> clients;

    /**
     * Constructeur d'objets de classe Serveur
     */
    public Serveur()
    {
        clients = new ArrayList<Client>();
    }

    public boolean connecter(Client client)
    {
        if(clients.contains(client)) {
            return false;
        }
        else {
            return clients.add(client);
        }
    }
    
    public void diffuser(String message)
    {
        Iterator<Client> liste_clients = clients.iterator();
        
        while(liste_clients.hasNext()) {
            liste_clients.next().recevoir(message);
        }
    }
}
