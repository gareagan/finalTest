package adventCode.Code;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Day1
{
    private String currString = "";
    private ArrayList<String> intHolder1 = new ArrayList<>();

    private HashMap<String, Integer> hash = new HashMap<>();

    public Day1()
    {
        setHash();
    }

    public void setHash()
    {

        this.hash.put("one", 1);
        this.hash.put("two", 2);
        this.hash.put("three", 3);
        this.hash.put("four", 4);
        this.hash.put("five", 5);
        this.hash.put("six", 6);
        this.hash.put("seven", 7);
        this.hash.put("eight", 8);
        this.hash.put("nine", 9);
    }

    public ArrayList<String> setNumbers()
    {
        ArrayList<String> numbersSet = new ArrayList<>();

        numbersSet.add("one");
        numbersSet.add("two");
        numbersSet.add("three");
        numbersSet.add("four");
        numbersSet.add("five");
        numbersSet.add("six");
        numbersSet.add("seven");
        numbersSet.add("eight");
        numbersSet.add("nine");

        return numbersSet;
    }

    public int mainMethod(ArrayList<String> allLines)
    {

        ArrayList<String> storeInts = new ArrayList<>();
        int addedChars;
        ArrayList<Integer> allInts = new ArrayList<>();


        for(String line : allLines)
        {
            storeInts = getBothInts(line);
            addedChars = addChars();
            allInts.add(addedChars);
            this.intHolder1 = new ArrayList<>();
        }

        int sum = 0;
        for(int num : allInts)
        {
            sum += num;
        }

        return sum;
    }

    public ArrayList<String> getBothInts(String line)
    {

        //Adding the character integers
        for (int i = 0; i < line.length(); i++)
        {
            Character currentChar = line.charAt(i);

            if (Character.isDigit(currentChar))
            {
                this.intHolder1.add(String.valueOf(currentChar));
            }

            if (Character.isLetter(currentChar))
            {
                this.currString = this.currString + String.valueOf(currentChar);
                checkString();
            }

        }
        return new ArrayList<>();
    }

    public void checkString()
    {
        ArrayList<String> numberSet = setNumbers();

        for (int i = 0; i < numberSet.size(); i++)
        {
            if (this.currString.contains(numberSet.get(i)))
            {
                this.intHolder1.add(numberSet.get(i));
                this.currString = "";
            }
        }
    }

    public int addChars()
    {
        String addedInts;

        int firstIndex = 0;
        int lastIndex = this.intHolder1.size() - 1;

        String firstInt = this.intHolder1.get(firstIndex);
        String lastInt = this.intHolder1.get(lastIndex);

        int newInt = 0;
        if (firstInt.length() == 1 && lastInt.length() == 1)
        {
            addedInts = String.valueOf(firstInt) + lastInt;
            newInt = Integer.parseInt(addedInts);
        }
        else if(firstInt.length() > 1 && lastInt.length() == 1)
        {
            int theInt1 = 0;
            int theInt2 = 0;


            theInt1 = this.hash.get(firstInt);
            theInt2 = Integer.parseInt(lastInt);

            //Can turn this into helper method
            String string1 = String.valueOf(theInt1);
            String string2 = String.valueOf(theInt2);

            addedInts = string1 + string2;
            newInt = Integer.parseInt(addedInts);
        }
        else if(firstInt.length() == 1 && lastInt.length() > 1)
        {
            int theInt1 = 0;
            int theInt2 = 0;

            theInt2 = this.hash.get(lastInt);
            theInt1 = Integer.parseInt(firstInt);

            //Can turn this into helper method
            String string1 = String.valueOf(theInt1);
            String string2 = String.valueOf(theInt2);

            addedInts = string1 + string2;
            newInt = Integer.parseInt(addedInts);
        }
        else
        {
            int theInt1 = 0;
            int theInt2 = 0;

            //I PROB DONT NEED THESE IF STATEMENTS

            theInt1 = this.hash.get(firstInt);
            theInt2 = this.hash.get(lastInt);

            //Can turn this into helper method
            String string1 = String.valueOf(theInt1);
            String string2 = String.valueOf(theInt2);

            addedInts = string1 + string2;
            newInt = Integer.parseInt(addedInts);
        }

        return newInt;
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
}
