package adventCode.Tests;
import adventCode.Code.Day1;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Day1Tests
{
    //WRITE MORE TEST CASES....
    //SOMEWHERE MY CODE FAILS...
    //WRITE TEST CASES FOR TOUGH LINES....

    //This is NOT correct...
    @Test
    public void testMainMethod1()
    {
        Day1 object = new Day1();
        String filePath = "src/adventCode/Data/Day1File1";

        ArrayList<String> fileContents = object.readFileContents(filePath);

        int actualSum = object.mainMethod(fileContents);
        int expectedSum = 54414;

        assertEquals(expectedSum, actualSum);
    }

    //This is correct...
    @Test
    public void testMainMethod2()
    {
        Day1 object = new Day1();
        String filePath = "src/adventCode/Data/Day1File3";

        ArrayList<String> fileContents = object.readFileContents(filePath);

        int actualSum = object.mainMethod(fileContents);
        int expectedSum = 281;

        assertEquals(expectedSum, actualSum);
    }

    //EDGE CASES TO TEST:

    //SINGLE DIGIT EDGE CASES...
    //2fvq
    //d6
    //9mpjm
    //jsnm7
    //6vdtnrr
    //5jptbc

    //eightfivegxblrtcjgbdfourfsczgvm1pqpjz
    //f96xhv
    //lxk24threekcftttdhg
    //ninetqsqdztthree96kkqzrqqsone

    //vqp2threenktcrcnqreightfourtpqjrpnxeightnine


    @Test
    public void singleDigitFirst()
    {
        Day1 object = new Day1();
        String line = "2fvq";

        object.getBothInts(line);
        int concatedInts = object.addChars();

        assertEquals(22, concatedInts);
    }

    @Test
    public void singleDigitLast()
    {
        Day1 object = new Day1();
        String line = "d6";

        object.getBothInts(line);
        int concatedInts = object.addChars();

        assertEquals(66, concatedInts);
    }

    @Test
    public void edgeCase1()
    {
        Day1 object = new Day1();
        String line = "vqp2threenktcrcnqreightfourtpqjrpnxeightnine";

        object.getBothInts(line);
        int concatedInts = object.addChars();

        assertEquals(29, concatedInts);
    }


}
