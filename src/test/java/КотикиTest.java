/**
 * Created by Student06 on 27.02.2017.
 */
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class КотикиTest {
    @org.junit.Test
    public void testName() throws Exception {
        assertEquals("Мяу", Котики.голос());

    }


}
