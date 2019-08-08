import org.junit.Assert;
import org.junit.Test;

public class BinarySearcherTest {

    int[] input1 = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
    int target1 = 11;

    int[] input2 = {1, 2, 3, 4, 5};
    int target2 = 10;

    @Test
    public void testInput1 (){
        Assert.assertEquals(5, BinarySearcher.search(input1,target1));
    }

    @Test
    public void testInput2 (){
        Assert.assertEquals(-1, BinarySearcher.search(input2,target2));
    }

}
