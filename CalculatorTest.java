import org.junit.test;
import static org.junit Assert.assert Equals;
public class CalculatorTest{
Calculator cal=new Calculator();
@Test public void testAddition(){assert Equals(15,cal.add(10,5));}
@Test public void testSubtraction(){assert Equals(5,cal.substract(10,5));}
@Test public void testMultiplication(){assert Equals(50,multiply(10,5));}
@Test public void testDivision(){assert Equals(2,cal.divide(10,5));}
}
