package patterns.singleton;


import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("Actual system last log.");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Actual system last log.", lastLog);
    }


}
