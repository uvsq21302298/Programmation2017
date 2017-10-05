
public class CompteBancaire {

	public int solde;
	
	public CompteBancaire(int s){
		if(s>0){
			this.solde = s;
		}
		else throw new IllegalArgumentException();
	}
	
	//utile si on passe le int de solde en private
	public int getsolde(){
		return this.solde;
	}
	
	public void credit(int c){
	
		this.solde = solde + c;
	}
    
	public void debit(int d){
		if(this.solde >= d && d>0)
			this.solde = solde -d;
	}
	
	public void virement (CompteBancaire c, int v){
		if(this.solde >= v && v<c.solde && v>0){
			this.debit(v);
			c.credit(v);
		}
	}
	
	public static void main(String args[])
    {
        
        CompteBancaire c = new CompteBancaire(20);
        System.out.println(c.solde);
        
    }


}
