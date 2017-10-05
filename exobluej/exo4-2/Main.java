

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
        //Etape a
        Serveur s = new Serveur();
        Client c1 = new Client("Thomas");
        Client c2 = new Client("Alexandre");
        c1.seConnecter(s);
        c2.seConnecter(s);
        //Etape b
        Client c3 = new Client("Olivier");
        c3.seConnecter(s);
        //Etape c
        c3.envoyer("Bonjour");
        
    }
}
