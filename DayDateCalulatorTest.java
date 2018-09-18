package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DayDateCalulatorTest {
    DayDateCalulator input;

    @Before

    public void setUp() throws Exception {
        input=new DayDateCalulator();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getFirstLastDay() {
        //Arrange
        String[] expectedValue=new String[]{"Mon 17/09/2018","Sun 23/09/2018"};
        //Act
        String[] result=input.getFirstLastDay();
        //Assert
        assertEquals(expectedValue,result);
    }
}