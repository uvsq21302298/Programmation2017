
/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private int num;
    private int denum;
    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        this.num = 6;
        this.denum = 2;
    }

    public String toString()
    {
        String a; String b;
        a = String.valueOf(num);
        b = String.valueOf(denum);
        return a + " / " + b;
    }
}
