import  static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import tutorial.*;

class TestCalc {
    Calc calc = new Calc(){};
    
    @Test
    void addition(){
        int result = calc.add(1,1);
        assertEquals(2, result);
    }
}
