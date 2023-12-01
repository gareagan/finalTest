import DataStructures.LinkedListNode;

public class LeetCode
{
    public int numberOfSteps(int num)
    {
        int counter = 0;
        while (num != 0)
        {
            if ((num % 2) == 0)
            {
                //Even
                num = num / 2;
            }
            else
            {
                //Odd
                num = num - 1;
            }

            counter++;
        }

        return counter;
    }

}
