import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

    @Test
    public void findTest() {
    Purse p = new Purse();

    p.add(Purse.QUARTER);
    Assert.assertTrue(p.find(Purse.QUARTER));
    Assert.assertFalse(p.find(Purse.DIME));

    }

    @Test
    public void countTest() {
    Purse p = new Purse();

    p.add(Purse.DOLLAR);

    Assert.assertEquals(1,p.count(Purse.DOLLAR),0);
    Assert.assertEquals(0, p.count(Purse.CENT));
    }

    @Test
    public void minMaxTest() {

        Purse p = new Purse();
        p.add(Purse.DOLLAR);
        p.add(Purse.DIME);
        Assert.assertEquals(Purse.DOLLAR, p.getMaximum());
        Assert.assertEquals(Purse.DIME, p.getMinimum());

    }

    @Test
    public void getTotalTest()
    {

        Purse p = new Purse();
        p.add(Purse.DOLLAR);
        p.add(Purse.QUARTER);
        p.add(Purse.DIME);

        Assert.assertEquals(1.35, p.getTotal(),0);

    }

    @Test
    public void addRemoveTest() {

        Purse p = new Purse();

        p.add(Purse.CENT);
        Assert.assertEquals(1, p.count(Purse.CENT));

        p.remove(Purse.CENT);
        Assert.assertEquals(0, p.count(Purse.CENT));


    }

    @Test
    public void hasCoinTest() {

        Purse p = new Purse();

        p.add(Purse.DOLLAR);
        Assert.assertTrue(p.hasCoin(Purse.DOLLAR));
        Assert.assertFalse(p.hasCoin(Purse.DIME));

    }

    @Test
    public void toStringTest() {
        Purse p = new Purse();
        p.add(Purse.DOLLAR);
        p.add(Purse.CENT);
        p.add(Purse.QUARTER);

        Assert.assertEquals("Purse[Dollar = 1, Quarter = 1, Dime = 0, Nickel = 0, Cent = 1]", p.toString());



    }

    @Test
    public void equalsTest() {
        Purse p1 = new Purse();
        p1.add(Purse.DOLLAR);
        p1.add(Purse.QUARTER);

        Purse p2 = new Purse();
        p2.add(Purse.DOLLAR);
        p2.add(Purse.QUARTER);
        Assert.assertEquals(p1, p2);

        Purse p3 = new Purse();
        p3.add(Purse.CENT);

        Assert.assertNotEquals(p2,p3);
    }
}