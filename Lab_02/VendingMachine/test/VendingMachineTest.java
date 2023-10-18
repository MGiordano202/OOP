import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest
{

    public void buyCan()
    {
        VendingMachine V = new VendingMachine();
       V.takeTokens();
       V.takeCan();
    }

    public void newCans()
    {
        VendingMachine V = new VendingMachine();
        V.addCans(1);

    }

    public void getCans()
    {
        VendingMachine V = new VendingMachine();
        V.getNumberOfCans();
    }

    public void getTokens()
    {
        VendingMachine V = new VendingMachine();
        V.getNumberOfTokens();
    }
}