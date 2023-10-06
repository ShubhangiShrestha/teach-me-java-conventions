package test;
import main.java.powerpackage.PowerFinder;
import org.junit.Test;

public class PowerTest{
    @Test
    public void oneRaisedToOne(){
        assert PowerFinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOne(){
        assert PowerFinder.OF(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwo(){
        assert PowerFinder.OF(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwo(){
        assert PowerFinder.OF(3, 2) == 9;
    }
}
