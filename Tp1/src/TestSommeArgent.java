import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestSommeArgent {
	
	private SommeArgent m12CHF;
	private SommeArgent m14CHF;
	private SommeArgent m14USD;
	
	private  static int i = 1; 
	
	@Before
	public void initialize() {
		m12CHF= new SommeArgent(12, "CHF"); 
		m14CHF= new SommeArgent(14, "CHF");
		m14USD= new SommeArgent(14, "USD");
		System.out.println("Befor test "+i);
	}
	
	@Test
	public void test() throws UniteDistincteException {
		SommeArgent expected = new SommeArgent(26, "CHF");
		SommeArgent result = m12CHF.add(m14CHF);
		Assert.assertTrue(expected.equals(result));
	}
	
	@Test
	public void testEquals() {
		Assert.assertTrue(!m12CHF.equals(null));
		Assert.assertEquals(m12CHF, m12CHF);
		Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		Assert.assertTrue(!m12CHF.equals(m14CHF));
		Assert.assertTrue(!m14USD.equals(m14CHF));
	}
	
	@Test(expected=UniteDistincteException.class)
	public void TestException() throws UniteDistincteException {
		m12CHF.add(m14USD);
	}
	
	@After
	public void AfterTest() {
		System.out.println("After test "+i);
		i++;
	}

}
