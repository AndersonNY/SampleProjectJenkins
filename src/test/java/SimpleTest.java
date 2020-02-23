import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test

    public void SimpleTest() {

        System.out.println("This test will always pass");

    }

    @Test

    public void failingTest () {

        System.out.println("never failure test");

         Assert.fail("failing test");

    }
}
