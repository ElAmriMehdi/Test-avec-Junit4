package elementaire;

import org.junit.Assert;
import org.junit.Test;

import ratio.Rationnel;

public class RationnelTest {

	@Test
	public void testAddition(){
		Rationnel r1 = new Rationnel(1, 2);
		Rationnel r2 = new Rationnel(1, 3);
		Rationnel somme = r1.addition(r2);
		Rationnel result = new Rationnel(5, 6);
		Assert.assertEquals(result, somme);
	}
	
	@Test
	public void testSoustraction(){
		Rationnel r1 = new Rationnel(1, 2);
		Rationnel r2 = new Rationnel(1, 3);
		Rationnel soustraction = r1.soustraction(r2);
		Rationnel result = new Rationnel(1, 6);
		Assert.assertEquals(result, soustraction);
	}
}
