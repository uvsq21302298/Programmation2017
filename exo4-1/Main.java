

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
        ChaineCryptee str;
        str = ChaineCryptee.FromCrypted( "test" ,3);
        System.out.println(str.Crypte());
		System.out.println(str.Decrypte());
    }
}
