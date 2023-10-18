import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {

    public void RtGoingDown()
    {
        Infected infected = new Infected("Bua");
        Assert.assertEquals("Bua", infected.getDisease());

        infected.addInfected(100);
        Assert.assertEquals(100, infected.getNumberOfInfected());
        infected.updateInfectedByRt(0.9);
        Assert.assertEquals(90, infected.getNumberOfInfected());


    }

    public void RtGoingUp()
    {

        Infected infected = new Infected("BuaBrutta", 100);
        Assert.assertEquals("BuaBrutta", infected.getDisease());

        infected.addInfected(200);
        Assert.assertEquals(300, infected.getNumberOfInfected());
        infected.updateInfectedByRt(2);
        Assert.assertEquals(600, infected.getNumberOfInfected());

    }
}