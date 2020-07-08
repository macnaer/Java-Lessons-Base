import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalc {
    private Calc calc;
    @Before
    public void CreateCalc(){
        calc = new Calc();
    }

    @Test
    public void Sum(){
        int sum = calc.Sum(4, 8);
        Assert.assertEquals(12, sum);
    }

    @Test
    public  void Minus(){
        int minus = calc.Minus(9,3);
        Assert.assertEquals(6, minus);
    }
}
