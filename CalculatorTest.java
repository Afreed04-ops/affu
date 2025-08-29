import org.junit.Test;  
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator cal = new Calculator(); 

    @Test 
    public void testAddition() {
        assertEquals(15, cal.add(10, 5));  
    }

    @Test 
    public void testSubtraction() {
        assertEquals(5, cal.subtract(10, 5));  
    }

    @Test 
    public void testMultiplication() {
        assertEquals(50, cal.multiply(10, 5));  
    }

    @Test 
    public void testDivision() {
        assertEquals(2, cal.divide(10, 5));  
    }
}
