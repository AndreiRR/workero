package wantsomeExercise;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionsTest {

    @Test
    public void throwANullPointerException() {
        Integer age = null;
        String ageToString = age.toString();
        String message = "You are " + ageToString + " years old.";
        Assert.assertEquals("You are 18 years old.", message);
    }

    @Test
    public void catchANullPointerExpcetion() {
        Integer age = null;
        String ageToString = null;
        try {
            ageToString = age.toString();
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            age = 18;
            ageToString = age.toString();
        }

        String message = "You are " + ageToString + " years old.";
        Assert.assertEquals("You are 18 years old.", message);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExpected() {
        Integer age = null;
        String ageToString = age.toString();
    }

    @Test
    public void tryCatchFinally() {
        Integer age = null;
        String ageToString = null;
        try {
            ageToString = age.toString();
            System.out.println("1. this code tries to run");
        }
        catch(NullPointerException e) {
            System.out.println("2. this code runs in case of exception");
        }
        finally {
            System.out.println("3. This code always runs.");
        }
    }


    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void expectedExceptionTest() {
        expected.expect(ArithmeticException.class);
        expected.expectMessage("/ by zero");
        int i = 10/0;
    }

    @Test(expected = ArithmeticException.class)
    public void exceptionTest() {
        int i = 10/0;
    }
}
