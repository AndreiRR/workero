package wantsomeExercise;

/**
 * Created by Andrei on 7/6/2017.
 */
public class StaticTest
{
    public static void main(String[] args)
    {
        StaticIsCalled firstRun = new StaticIsCalled();
        firstRun.asStatic();
    }
}

class StaticIsCalled
{
    public void asStatic()
    {
        System.out.println("Hello");

    }

}

