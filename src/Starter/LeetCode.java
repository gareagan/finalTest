package Starter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


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


    //Not finished
    // - Mayb finish later
    public int[] twoSum(int[] nums, int target)
    {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        int[] returnArray = new int[2];

        for (int element : nums)
        {
            myArrayList.add(element);
        }

        for (int i = 0; i < myArrayList.size() - 1; i++)
        {
            for (int x = 1; x < myArrayList.size(); x++)
            {
                Integer firstVar = myArrayList.get(i);
                Integer secondVar = myArrayList.get(i + 1);
                if (firstVar + secondVar == target)
                {
                    //Convert to int
                    int add1 = firstVar.intValue();
                    int add2 = secondVar.intValue();

                    returnArray[0]= add1;
                    returnArray[1] = add2;
                }
            }

        }

        return nums;
    }



    public int mainMethod(ArrayList<String> allLines)
    {

        //Can test this method by passing an arrayList of lines

        ArrayList<Character> storeChars = new ArrayList<>();
        int addedChars;
        ArrayList<Integer> allInts = new ArrayList<>();


        for(String line : allLines)
        {
            storeChars = getInts(line);
            addedChars = addChars(storeChars);
            allInts.add(addedChars);
        }

        int sum = 0;
        for(int num : allInts)
        {
            sum += num;
        }

        return sum;
    }


    public ArrayList<Character> getInts(String line)
    {
        int sum = 0;
        ArrayList<Character> charHolder = new ArrayList<>();

        for (int i = 0; i < line.length(); i++)
        {
            Character currentChar = line.charAt(i);

            if (Character.isDigit(currentChar))
            {
                charHolder.add(currentChar);
            }

        }

        return charHolder;
    }

    public ArrayList<String> readFileContents(String filePath)
    {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;

            // Read each line from the file and add it to the ArrayList
            //If there are more lines left to read, (reader.readLine() == null)
            //Then while loop stops executing.
            while ((line = reader.readLine()) != null)
            {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        return lines;
    }

    public int addChars(ArrayList<Character> allInts)
    {
        String addedChars;

        int firstIndex = 0;
        int lastIndex = allInts.size() - 1;

        char firstChar = allInts.get(firstIndex);
        char lastChar = allInts.get(lastIndex);

        addedChars = String.valueOf(firstChar) + lastChar;

        int newInt = Integer.parseInt(addedChars);

        return newInt;
    }





}
