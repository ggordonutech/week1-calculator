import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void shouldMultiplyThreeNumbers() {
		Calculator calc = new Calculator();
		float result = calc.multiply(3f, 4f, 5.0f);
		assertEquals(60f,result,0);
	}

}
