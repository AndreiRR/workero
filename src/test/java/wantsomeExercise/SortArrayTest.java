package wantsomeExercise;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Andrei on 7/6/2017.
 */
public class SortArrayTest
{
    @Test
    public void sortArr(){

        String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","aaaaaa"};

        for(String workday : workdays)
        {
            Arrays.sort(workdays, Collections.reverseOrder());
            System.out.println(workday);
        }
    }

    @Test
    public void sortArrNumbers()
    {
        Integer[] myNumbers = {9,2,6,1,7,42,4,0,13};
        Arrays.sort(myNumbers);

        for (int myNumber : myNumbers)
        {

            System.out.println(myNumber);
        }
    }

    @Test
    public void sortArrStrings()
    {
        String[] myStrings = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Arrays.sort(myStrings);

        for(String myString : myStrings)
        {
            System.out.println(myString);
        }
    }
}
