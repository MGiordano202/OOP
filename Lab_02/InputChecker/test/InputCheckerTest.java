import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest
{

    public void CheckSi()
    {

        InputChecker input = new InputChecker();
        Assert.assertEquals("OK", input.checkInput("S"));
        Assert.assertEquals("OK", input.checkInput("SI"));
        Assert.assertEquals("OK", input.checkInput("OK"));
        Assert.assertEquals("OK", input.checkInput("certo"));
        Assert.assertEquals("OK", input.checkInput("perchè no?"));

    }

    public void CheckNo()
    {

        InputChecker input = new InputChecker();
        Assert.assertEquals("Fine", input.checkInput("N"));
        Assert.assertEquals("Fine", input.checkInput("No"));

    }

    public  void CheckNC()
    {

        InputChecker input = new InputChecker();
        Assert.assertEquals("Dato non corretto", input.checkInput("Pino"));

    }

}