package Starter;
import Starter.LeetCode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
//No need to import testing resources


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

    //Test works code doesn't
    @Test
    public void testTwoSum()
    {
        LeetCode object = new LeetCode();

        int[] nums = {2, 4, 5, 10};
        int target = 15;

        int[] actual = object.twoSum(nums, target);
        int[] expected = {5, 10};


        for (int i = 0; i < expected.length; i++)
        {
            assertEquals(expected[i], actual[i]);
        }

    }

    public ArrayList<Character> expectedHelper()
    {
        ArrayList<Character> expected = new ArrayList<>();
        expected.add('1');
        expected.add('2');
        expected.add('2');
        expected.add('9');

        return expected;
    }

    @Test
    public void testGetInts()
    {
        LeetCode object = new LeetCode();
        String testLine = "12jdf2sdjasd9";

        ArrayList<Character> actual = object.getInts(testLine);
        ArrayList<Character> expected = expectedHelper();

        //Assert that all ints are in arrayList
        for (int i = 0; i < expected.size(); i++)
        {
            assertEquals(expected.get(i), actual.get(i));
        }

    }


    @Test
    public void testAddChars()
    {
        LeetCode object = new LeetCode();
        String currentLine = "12jdf2sdjasd9";

        ArrayList<Character> actualList = object.getInts(currentLine);
        ArrayList<Character> expectedList = expectedHelper();

        int expectedAdd = 19;
        int actualAdd = object.addChars(actualList);

        //Assert that first and last chars of curr line added together is correct.
        assertEquals(expectedAdd, actualAdd);

    }

    @Test
    public void testMainMethod()
    {
        LeetCode object = new LeetCode();

        ArrayList<String> tempFileContents = new ArrayList<>();
        tempFileContents.add("1abc2");
        tempFileContents.add("pqr3stu8vwx");
        tempFileContents.add("a1b2c3d4e5f");
        tempFileContents.add("treb7uchet");

        int actualSum = object.mainMethod(tempFileContents);
        int expectedSum = 142;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMainMethod2()
    {
        LeetCode object = new LeetCode();
        String filePath = "src/starter/adventCodeFile2";

        ArrayList<String> fileContents = object.readFileContents(filePath);

        int actualSum = object.mainMethod(fileContents);
        int expectedSum = 142;

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void finaltest()
    {
        LeetCode object = new LeetCode();
        String filePath = "src/starter/adventCodeFile1";

        ArrayList<String> fileContents = object.readFileContents(filePath);

        int actualSum = object.mainMethod(fileContents);
        int expectedSum = 55477;

        assertEquals(expectedSum, actualSum);
    }


}
