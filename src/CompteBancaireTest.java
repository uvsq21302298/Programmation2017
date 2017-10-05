import static org.junit.Assert.*;

import org.junit.Test;


public class CompteBancaireTest {

	@Test
	public void testCompteBancaire() {
		CompteBancaire c = new CompteBancaire(50);
		assertTrue("le compte n'est pas initialisé",c.getsolde() == 50);
	}
	
	@Test
	public void testCredit() {
		CompteBancaire c = new CompteBancaire(50);
		c.credit(30);
		assertTrue("Le credit nest pas effectuer",c.solde == 80);
	}
	
	@Test
	public void testDebit() {
		CompteBancaire c = new CompteBancaire(50);
		c.debit(30);
		assertTrue("Le debit nest pas effectuer",c.solde == 20);
	}
	
	@Test
	public void testVirement() {
		CompteBancaire c = new CompteBancaire(50);
		CompteBancaire c2 = new CompteBancaire(50);
		assertEquals(c.solde,c2.solde);
		c.virement(c2,30);
		assertTrue("Le virement n'est pas effectuer",c.solde == 20);
		assertTrue("Le virement n'est pas effectuer",c2.solde == 80);
	}
	
	@Test (expected= IllegalArgumentException.class)
		public void valeur_negative(){
		CompteBancaire c1 = new CompteBancaire(-50);
	}
}
