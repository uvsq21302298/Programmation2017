
/**
 * Write a description of class Fraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraction
{
    // instance variables - replace the example below with your own
    private double num;
    private double denum;
    /**
     * Constructor for objects of class Fraction
     */
    public Fraction()
    {
        this.num = 6;
        this.denum = 2;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return Double.valueOf(num).toString() + " / " + Double.valueOf(denum).toString();
    }
}
