import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class exampleCalculatorTest {

    @Test
    void FiveAndFiveTotalsTen(){
        var cal = new exampleCalculator();
        assertEquals(10, cal.additon(5,5));
    }

    @Test
    void TenTakeThreeTotalsSeven(){
        var cal = new exampleCalculator();
        assertEquals(7, cal.subtraction(10,3));
    }

    @Test
    void SixtyDividedByThreeTotalsTwenty(){
        var cal = new exampleCalculator();
        assertEquals(20,cal.division(60,3));
    }

    @Test
    void SevenMultipliedByFour(){
        var cal = new exampleCalculator();
        assertEquals(28,cal.multiplication(7,4));
    }



}