package TriangleTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static TriangleFunction.TriangleFunc.triangleArea;

public class FunctionsTests {
    @Test
    void positiveTriangleAreaCalculationTest() throws Exception {
        Assertions.assertEquals(triangleArea(3, 3, 3), 2.23606797749979);
        //сравниваем значение в скобках со значением после запятой
    }

    @Test
    void degenerateTriangleTest() {
        assertThatExceptionOfType(Exception.class).isThrownBy(() -> triangleArea(-1, 4, 6));
    }
}
