import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCodeTests
{
    @Test
    public void testOne()
    {
        LeetCode object = new LeetCode();

        int actual1 = object.numberOfSteps(14);
        assertEquals(6, actual1);

        int actual2 = object.numberOfSteps(8);
        assertEquals(4, actual2);

        int actual3 = object.numberOfSteps(123);
        assertEquals(12, actual3);

    }
}
