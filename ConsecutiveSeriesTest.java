package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveSeriesTest {
    ConsecutiveSeries input;

    @Before
    public void setUp() throws Exception {
        input=new ConsecutiveSeries();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void consecutiveSeriesChecker() {
        //Arrange
        String expectedValue="consecutive Series";
        //Act
        String result=input.consecutiveSeriesChecker(new int[]{1,2,3,4,5,6,7});
        //Assert
        assertEquals(expectedValue,result);
    }
}