package wantsomeExercise;

import org.junit.Test;

/**
 * Created by Andrei on 7/6/2017.
 */
public class IterateOverAnArray
{
    @Test
    public void iterateOverAnArray()
    {
        String[] usersList = {"andrei","ioana","cristi","ovidiu","maria"};

        for(String user : usersList)
        {
           System.out.println(user);
        }
    }
}
