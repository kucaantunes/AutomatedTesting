
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import CalculatorProject.Calculator;

public class CalculatorTest {
	Calculator	calc;
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	
	
	@Test
	public void addTwonumbers() {
		
		assertEquals(10, calc.add(5,5));
	}
	
	@Test
	public void addThreenumbers() {
		
		assertEquals(20, calc.add(5,5,10));
	}
	
	@Test
	public void subtractTwonumbers() {
		
		assertEquals(0, calc.subtract(10,10));
	}
	
	@Test
	public void subtractThreenumbers() {
		
		assertEquals(0, calc.subtract(0,0,0));
	}

}
