public class Client
{
    private String nom;
    private Serveur serveur;

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String nom)
    {
        this.nom = nom;
        this.serveur = null;
    }

    public boolean seConnecter(Serveur serveur)
    {
        boolean reponse = serveur.connecter(this);
        if(reponse == false) // connexion annuler
            return false;
        else {
            this.serveur = serveur; //connexion réussi
            return true;
        }
    }
    
    public void envoyer(String message)
    {
        if(serveur != null)
            serveur.diffuser(nom + ": " + message);
    }
    
    public String recevoir(String message)
    {
        return message;
    }
}