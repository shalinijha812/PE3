package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessMakerTest {
    ChessMaker input;

    @Before
    public void setUp() throws Exception {
        input=new ChessMaker();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void chessPattern() {
        //Arrange
        int expectedValue=0;
        //Act
        int result=input.chessPattern();
        //Assert
        assertEquals(expectedValue,result);
    }
}