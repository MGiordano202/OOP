import org.junit.Assert;
import org.junit.Test;

public class LockerTest {

    public void locked() {

        Locker locker = new Locker();
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
    }

    public void Unlock() {

        Locker locker = new Locker();
        locker.newComb("Pino");
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
        locker.unlock("Pino");
        Assert.assertTrue(locker.isOpen());

    }

    public void WrongCode()
    {

        Locker locker = new Locker();
        locker.newComb("Pino");
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
        locker.unlock("Gino");
        Assert.assertFalse(locker.isOpen());


    }

}