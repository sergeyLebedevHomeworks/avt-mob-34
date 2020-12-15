import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Before
    public void textStartTest()
    {
        System.out.println("Start Test");
    }

    @After
    public void textFinishTest()
    {
        System.out.println("Finish Test");
    }

    @Test
    public void testGetLocalNumber()
    {
        int extended = 14;
        int equals = getLocalNumber();
        Assert.assertTrue (equals == extended);

    }

    @Test
    public void testGetClassNumber()
    {
        int equals = getClassNumber();
        int big = 45;
        Assert.assertTrue (equals < big);

    }

    @Test
    public void testGetClassString()
    {
        String strTrue = "Hello";
        if (getClassString().contains("hello"))
        {
            System.out.println("False");
        } else
            {
            System.out.println("True");
            }
        Assert.assertTrue(getClassString().contains("Hello") == strTrue.contains("hello"));
    }
    private void strTrue() {
    }
}