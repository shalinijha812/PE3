package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsExcludedTest {
    VowelsExcluded input;

    @Before
    public void setUp() throws Exception {
        input=new VowelsExcluded();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void removeVowels() {
        //Arrange
        String[] expectedValue = {"Ind", "Untd Stts"};
        //Act
        String[] result = input.removeVowels(new String[]{"India", "United States"}, 2);
        //Assert
        assertEquals(expectedValue, result);
    }
}