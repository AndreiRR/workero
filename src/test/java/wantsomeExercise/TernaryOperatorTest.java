package wantsomeExercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrei on 7/6/2017.
 */
public class TernaryOperatorTest
{
    @Test
    public void ternaryOperator()
    {
        int numberOfCats;
        int cat = 1;
        int cats = 2;
        numberOfCats = (cats == 2) ? cats : cat;
        assertEquals(cats,2);
        System.out.println(numberOfCats);
    }
}
