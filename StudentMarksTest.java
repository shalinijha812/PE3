package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks input;

    @Before
    public void setUp() throws Exception {
        input=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void checkGrades() {
        //Arrange
       int expectedValue=0;
       //Act
        int result=input.checkGrades(new int[]{10,20,30,40,10},5);
        //Assert
        assertEquals(expectedValue,result);
    }
}