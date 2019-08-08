import org.junit.Assert;
import org.junit.Test;

public class VowelOnlyTest {

    @Test
    public void test1(){
        Assert.assertTrue(VowelOnly.find("Hello World!").equals("eoo"));
    }

    @Test
    public void test2(){
        Assert.assertTrue(VowelOnly.find("Udacity Course").equals("Uaioue"));
    }
}
