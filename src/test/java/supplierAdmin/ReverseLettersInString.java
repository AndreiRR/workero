package supplierAdmin;

import org.junit.Test;

/**
 * Created by Andrei on 7/7/2017.
 */
public class ReverseLettersInString
{
    @Test
    public void reverseStr()
    {
         String myStr = "Andrei";
         String reversedStr = "";



         for(int i = myStr.length()-1; i >= 0; i-- )
         {
             reversedStr += myStr.charAt(i);
         }
        System.out.println(reversedStr);
        StringBuffer buffer = new StringBuffer(myStr);
        System.out.println(buffer.reverse());
    }
}
