/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction implements Comparable<Fraction>
{
    
    private final int num; //le final empeche la modification de la valeur après initialisation de celle ci
    private final int denum;
    
    static Fraction ZERO = new Fraction();
    static Fraction UN = new Fraction(1, 1);

    public Fraction(int num, int denum)
    {
        this.num = num;
        this.denum = denum;
    }
    
    public Fraction(int num)
    {
        this(num, 1);
    }
    
    public Fraction()
    {
        this(0, 1);
    }
    
    public static int pgcd(int a,int b) {
        int r = a;
        //dernier reste non nul
        while (r != 0) {
            r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    
    public static Fraction getReducedFraction(int num, int denum)
    {
        int pgcd = pgcd(num, denum);
        return new Fraction(num / pgcd, denum / pgcd);
    }
    
    public int getNum(){ return num; }
    public int getDenum(){ return denum; }
    public double doubleValue(){ return ((double) num / (double) denum); }
    
    public Fraction add(Fraction f)
    {
        return getReducedFraction(num * f.denum + denum * f.num, denum * f.getDenum());
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Fraction) { //ici, on vérifie si o est bien un objet fraction
            Fraction f1 = getReducedFraction(num, denum);
            Fraction f2 = getReducedFraction(((Fraction) o).getNum(), ((Fraction) o).getDenum());
            // le type est seulement connu a l'execution donc on cast o en fraction pour le compilateur
            return f1.getNum() == f2.getNum() && f1.getDenum() == f2.getDenum();
        }
        else {
            return false;
        }
    }
    
    @Override
    public String toString()
    {
        if(denum != 1) {
            return Integer.valueOf(num).toString() + " / " + Integer.valueOf(denum).toString();
        }
        else {
            return Integer.valueOf(num).toString();
        }
    }
    
    /**
     * Compare deux nombres : -1 si plus petit, +1 si plus grand, 0 si c'est égal.
     */
    public int compareTo(Fraction o)
    {
        //a - b = a + (-b)
        Fraction f1 = getReducedFraction(- o.getNum(), o.getDenum()); // b = - b
        Fraction f2 = this.add(f1); // a - b
        
        return Math.abs(f2.getNum() * f2.getDenum()) / (f2.getNum() * f2.getDenum());
          
    }
}