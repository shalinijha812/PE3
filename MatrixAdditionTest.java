package myexercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition input;

    @Before
    public void setUp() throws Exception {
        input = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        input = null;
    }

    @Test
    public void sum() {
        //Arrange
        int[][] expectedValue = new int[][]{{10, 10, 10}, {10, 10, 10}};
        //Act
        int[][] result = input.sum(2, 3, new int[][]{{1, 2, 3}, {4, 5, 6}}, new int[][]{{9, 8, 7}, {6, 5, 4}});
        //Assert
        assertEquals(expectedValue, result);
    }
}