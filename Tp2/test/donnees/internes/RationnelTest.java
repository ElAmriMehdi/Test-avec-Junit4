package donnees.internes;

import helpers2.Data;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ratio.Rationnel;

@RunWith(Parameterized.class)
public class RationnelTest {
	
	public static int i = 0; 
	
	public Rationnel r1; 
	public Rationnel r2; 
	public Rationnel resultAddition;
	public Rationnel resultSoustraction;
	
	public RationnelTest(Rationnel r1, Rationnel r2, Rationnel resultAddition, Rationnel resultSoustraction){
		this.r1 = r1; 
		this.r2 = r2; 
		this.resultAddition = resultAddition;
		this.resultSoustraction = resultSoustraction;
	}
	
	@Test
	public void toutesLesVerifications(){
		System.out.println("test rationnel :"+ (i+1) +(" (r1, r2, resultAddtion, resultSoustraction) = "
				+ "("+r1.toString()+", "+r2.toString()+", "+ resultAddition.toString()+", "+resultSoustraction.toString()+")"));
		Assert.assertEquals(r1.addition(r2), resultAddition);
		Assert.assertEquals(r1.soustraction(r2), resultSoustraction);
		i++;
	}
	
	@Parameters
	public static Collection<Rationnel[ ]> data(){
		
		File inputFile = new File("donneesDeTests.xml");
		List<Rationnel[]> donneesDeTest = new ArrayList<Rationnel[]>();
		try {
			JAXBContext context = JAXBContext.newInstance("helpers2");
			Unmarshaller decodeur = context.createUnmarshaller();
			helpers2.DataSet dataset = (helpers2.DataSet)decodeur.unmarshal(inputFile);
			
			for(Data d: dataset.getData()){
				Rationnel[] unJeuDeTest = new Rationnel[4];
				helpers2.Rationnel r1 = d.getR1();
				helpers2.Rationnel r2 = d.getR2();
				helpers2.Rationnel resultAddition = d.getResultAddition();
				helpers2.Rationnel resultSoustraction = d.getResultSoustraction();
				
				unJeuDeTest[0] = new Rationnel(r1.getNumerateur(), r1.getDenominateur());
				unJeuDeTest[1] = new Rationnel(r2.getNumerateur(), r2.getDenominateur());
				unJeuDeTest[2] = new Rationnel(resultAddition.getNumerateur(), resultAddition.getDenominateur());
				unJeuDeTest[3] = new Rationnel(resultSoustraction.getNumerateur(), resultSoustraction.getDenominateur());
				
				donneesDeTest.add(unJeuDeTest);
			}
			
		}catch(JAXBException e){
			e.printStackTrace();
		}
		
		return donneesDeTest;
	}
	
	
}
