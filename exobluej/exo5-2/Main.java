

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
        
        Fraction fra = new Fraction(2,1);
        System.out.println(fra.getNum());
		System.out.println(fra.getDenum());
		System.out.println(fra.doubleValue());
		Fraction fra2 = new Fraction(4,1);
		System.out.println(fra.compareTo(fra2));
    }
}
